package com.bridgelabz.utility;


class Node<T> {

	T data;
	Node next;
	int index;
	
}

public class LinkedList {
	Node head;

	public <T> void insert(T data)
	{
		Node node = new Node();
		node.data=data;
		node.next = null;
	
		if (head==null)
		{
		    head=node;	
		}
		else
		{
			Node hd=head;
		    while (hd.next!=null)
		    {
			   hd=hd.next;	
			}	
		    hd.next=node;		    
		}
		
	}
	
	public void show() 
	{
		Node node = head;
		while (node.next != null)
		{
			System.out.println(node.data);
			
			node = node.next;

		}
		System.out.println(node.data);
	}
	
	public void removeatindex(int index)
	{
          	   	if (index==0)
          	   	{
				   head=head.next;	
				}
          	   	else
          	   	{
				 Node node=head;
				 Node n=null;
				 for (int i = 0; i < index-1; i++) 
				 {
				   node=node.next;	
				 
				}
				 n=node.next;
				 
				 node.next=n.next;
			       
				}
          	   	
          	   
	}

	public <T> void search(Node head, T sname) 
	{
		Node node = head;

		while (node != null) {
			if (node.data.equals(sname)) 
			{
					 
                System.out.println("Yes");
                
                //removebycontent(sname);
			}
			node = node.next;
		}
		        
	}
	
	public char peek()
	{
		Node node = head;
	   return (char) node.data;	
	}
	
}
//end