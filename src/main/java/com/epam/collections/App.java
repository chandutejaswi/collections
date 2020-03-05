package com.epam.collections;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	CustomList list=new CustomList();
    	LOGGER.info("Enter no of intial elements(Minimum 10 elements):");
    	int n=sc.nextInt(),data;
    	if(n<10)
    	{
    		LOGGER.info("You should enter atleast 10 elements");
    	}
    	else
    	{
    		LOGGER.info("Enter elements:");
    		for(int i=0;i<n;i++)
    		{
    			data=sc.nextInt();
    			list.add(data);
    		}
    		int choice;
    		while(true)
    		{
    			LOGGER.info("1.Add\n2.Delete\n3.Fetch\n4.Display\n");
    			LOGGER.info("Enter an operation:");
    			choice=sc.nextInt();
    			if(choice==1)
    			{
    				LOGGER.info("Enter element to be inserted:");
    				data=sc.nextInt();
    				list.add(data);
    				//list.display();
    			}
    			else if(choice==2)
    			{
    				LOGGER.info("Enter element to be deleted:");
    				data=sc.nextInt();
    				list.delete(data);
    				//list.display();
    			}
    			else if(choice==3)
    			{
    				LOGGER.info("Enter element to search:");
    				data=sc.nextInt();
    				if(list.fetch(data))
    					LOGGER.info("Element found");
    				else
    					LOGGER.info("Element not found");
    			}
    			else if(choice==4)
    			{
    				list.display();
    			}
    			else
    			{
    				LOGGER.info("exited");
    				return;
    			}
    		}
    	}
    }
}
