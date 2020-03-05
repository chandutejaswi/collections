package com.epam.collections;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CustomList {
	Node head;
	public CustomList()
	{
		head=null;
	}
	public void add(int newItem)
	{
		Node n=new Node(newItem);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=n;
		}
	}
	public boolean fetch(int key)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==key)
				return true;
			temp=temp.next;
		}
		return false;
	}
	public void delete(int key)
	{
		Node parent=head,child=head;
		if(head!=null)
		{
			if(head.data==key)
			{
				head=head.next;
			}
			else
			{
				while(child!=null)
				{
					parent=child;
					child=child.next;
					if(child.data==key)
					{
						break;
					}
				}
				if(child.data==key)
				{
					parent.next=child.next;
				}
			}
		}

	}
	public void display()
	{
	    Node *t=head;
	    if(head!=null)
        {
            while(t!=null)
            {
                LOGGER.info(t.data+" ");
                t=t.next;
            }
             LOGGER.info("\n");
        }
	}
}
