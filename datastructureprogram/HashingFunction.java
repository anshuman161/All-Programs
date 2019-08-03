package com.bridgelabz.datastructureprogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class HashingFunction<K> {

	class Entry<K> {
		K key;
		Entry<K> link;

		Entry(K key) {
			this.key = key;
		}
	}

	public static final Logger logger = Logger.getLogger(HashingFunction.class.getName());
	int capacity = 11;
	int index = 0;
	Entry<K> next;
	private Entry<K>[] map = new Entry[capacity];

	@SuppressWarnings("unchecked")
	public void readFile() {
		try (FileReader fr = new FileReader("E://Laratest/brid1.txt"); 
				BufferedReader br = new BufferedReader(fr)) {
			     String str = "";
			while ((str = br.readLine()) != null) {
				String[] sarr = str.split(" ");
				for (int i = 0; i < sarr.length; i++) 
				{
					if (index == capacity - 1) 
					{
						return;
					}
					Integer keys = Integer.parseInt(sarr[i]);
					int hashes = hash((K) keys);
					Entry entry = new Entry(keys);

					if (map[hashes] == null)
					{
						map[hashes] = entry;
					} 
					else 
					{
						next = map[hashes];
						while (next.link != null) 
						{
							if (next.key.equals(keys))
								break;
							next = next.link;
						}
						if (next.link == null && !(next.key.equals(keys))) 
						{
							next.link = entry;
						}
					}
				}
			}
		}
		catch (IOException e) 
		{
			logger.info(e.getMessage());
		}
	}

	private int hash(K key) 
	{
		return key.hashCode() % capacity;
	}

	public void display() 
	{
		for (int i = 0; i < map.length; i++)
		{
			next = map[i];
			while (next != null) 
			{
				System.out.print(next.key + " ");
				next = next.link;
			}
		}
	}

	public void search(K key)
	{
		int hashes = hash(key);
		Entry<K> temp;
		Entry<K> searchEntry = new Entry<K>(key);
		if (map[hashes] == null) {
			map[hashes] = searchEntry;
			writeFile();
			return;
		}
		if (map[hashes].key.equals(key)) 
		{
			map[hashes] = map[hashes].link;
		}
		else
		{
			next = map[hashes];
			while (next.link != null) {
				if (next.link.link == null) {
					break;
				}
				if (next.link.key.equals(key)) {
					temp = next.link;
					next.link = temp.link;
					temp = null;
					writeFile();
					return;
				}
				next = next.link;
			}
			if (next.link == null) {
				next.link = searchEntry;
			}
			if (next.link.key.equals(key)) {
				next.link = null;
			} else {
				next.link.link = searchEntry;
			}
		}
		writeFile();
	}

	public void writeFile() 
	{
		try (FileWriter fw = new FileWriter("E://Laratest/brid.txt")) {
			for (int i = 0; i < map.length; i++) {
				next = map[i];
				while (next != null)
				{
					fw.write(next.key.toString() + " ");
					next = next.link;
				}
			}
			fw.flush();
		} catch (IOException e) {
			logger.info(e.getMessage());
		}
	}
}
