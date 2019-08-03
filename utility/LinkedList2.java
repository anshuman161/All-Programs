package com.bridgelabz.utility;

class NodeForOrder
{
	int data;
	NodeForOrder next;
	int index;
	
}
public class LinkedList2
{
	NodeForOrder head;
 
	
	public void insertdata(int data)   //-------1
   {
	NodeForOrder node = new NodeForOrder();
	node.data=data;
	node.next = null;

	if (head==null)
	{
	    head=node;	
	}
	else
	{
		NodeForOrder hd=head;
	    while (hd.next!=null)
	    {
		   hd=hd.next;	
		}	
	    hd.next=node;		    
	}
   }



    public void sortList()   ///------------2
    {  
	 NodeForOrder i,j;
	 NodeForOrder current = head;
      i=head;
      j=head.next;
      int temp;  
      for (i = head; i !=null; i=i.next)
      {
		  for (j = head; j!=null ; j=j.next)
		  {
			  if (i.data < j.data)
				{
				  	 temp=j.data;
				  	 j.data=i.data;
				  	 i.data=temp;
				      	 
				}
			
		}	
		}
      
          
    }



     public void show1()        ///----------------
     {
	  NodeForOrder node = head;
	  while (node.next != null)
	   {
		System.out.println(node.data);
		node = node.next;   
	  }
	    System.out.println(node.data);
     }

     public void removeatindex1(int index)
 	{
           	   	if (index==0)
           	   	{
 				   head=head.next;	
 				}
           	   	else
           	   	{
 				 NodeForOrder node=head;
 				NodeForOrder n=null;
 				 for (int i = 0; i < index; i++) 
 				 {
 				   node=node.next;	
 				   
 				}
 				 n=node.next;
 				 
 				 node.next=n.next;
 			       
 				}
           	   	
           	   
 	}   
}