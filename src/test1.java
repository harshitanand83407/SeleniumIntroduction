

import java.util.ArrayList;

import org.testng.annotations.Test;



public class test1 {


		// TODO Auto-generated method stub
	@Test
    public void regular()
    {
    ArrayList<String> name=new ArrayList<String>();
    name.add("Harshit");
    name.add("Anand");
    name.add("Harsh");
    name.add("Mahapara");
    name.add("Nagendra");
    name.add("Ayush");
    int count=0;
    for(int i=0;i<name.size();i++)
    {
    	String actual=name.get(i);
    	if(actual.startsWith("H"))
    	{
    		count++;
    	}
    }
    System.out.println(count);
    }
     
	}


