package JavaStreams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;



public class test1 {


		// TODO Auto-generated method stub
	/*
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
    	if(actual.startsWith("A"))
    	{
    		count++;
    	}
    }
    System.out.println(count);
    }
    
	
	@Test
	public void streamFilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Arijit");
		names.add("Atif");
		names.add("KK");
		names.add("Harshit");
		names.add("Anand");
		names.add("Monu");
		
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		long d=Stream.of("Abhijeet","Harshit","Don","Adam","Monu","Nagendra").filter(s->
		{
		     s.startsWith("A");	
		     return true;
		}).count();
		System.out.println(d);
		//for limiting the names
		//names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		//without limit
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	}
	
	@Test
	public void streamMap1()
	{
		//print with ends with A with upparcase uppercase
		Stream.of("Anna","Bala","Cat","Dog","Elephant").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
	    .forEach(s->System.out.println(s));
		
		//convert array into list print with starts with A and sort it
		List<String> names = Arrays.asList("Anar","Ball","Ahuja","Cat","Abcd");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
	    .forEach(s->System.out.println(s));
	}
	
	@Test
	public void streamMap2()
	{
	ArrayList<String> names=new ArrayList<String>();
	names.add("Harshit");
	names.add("Anand");
	names.add("Monu");
	         //print with ends with A with upparcase uppercase
			Stream.of("Anna","Bala","Cat","Dog","Elephant").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		    .forEach(s->System.out.println(s));
			
			//print which starts with A and in sorted manner
			List<String> names1 = Arrays.asList("Anna","Ball","Ahuja","Cat","Abcd");
			names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		    .forEach(s->System.out.println(s));
			
			//concatination of two list
			Stream<String> newStream = Stream.concat(names.stream(),names1.stream());
			boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Anna")); 
			System.out.println(flag);
			Assert.assertTrue(flag);
	}
	
	@Test
	public void streamMap3()
	{
	List<String> names3 =Stream.of("Ankit","Harshit","Harish","Harsh","Nagendra","Mahapara").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(names3.get(0));
	
	List<Integer> values=Arrays.asList(1,3,5,7,9,3,5,7,8);
	values.stream().distinct().forEach(s->System.out.println(s));
	//print unique number
	//sort array-get 3rd index
	
	List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(li.get(2));
	}
	*/
	@Test
	public void Demo()
	{
		System.out.println("abcd");
	}
     
	}


