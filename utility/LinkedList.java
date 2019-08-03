package com.bridgelabz.utility;


class Node<T> 
{

	T data;
	Node next;
	int index;
	T temp;
}
/**
 * @
 * 
 * **/
public class LinkedList 
{
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
	public<T> void duplicate(T data,String sname) 
	{
		Node node=head;
       Node dom=null;		
		while (node.next!=null)
		{
		if (sname.equalsIgnoreCase((String) node.data))
		{
		   dom=node.next;
		   
		}
		   node.next=dom.next;  
		}
	}
			
				
		
	
	public void sortList()   ///------------2
    {  
	 Node i,j;
	 Node current = head;
      i=head;
      j=head.next;
       Object temp; 
      for (i = head; i !=null; i=i.next)
      {
		  for (j = head; j!=null ; j=j.next)
		  {
			  if (i.data.toString().compareTo((String) j.data)<0)
				{
				  	  temp = j.data;
				  	 j.data=i.data;
				  	 i.data=temp;
				      	 
				}
			
		}	
		}
      
          
    }
	
}
//end