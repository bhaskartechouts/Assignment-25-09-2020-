package org.techouts.app.problem_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapObject {
	int key;
	Scanner sc = new Scanner(System.in);
	List<String> list = new LinkedList<>();
	Map<Integer, String> hashMap = new HashMap<>();
	PersonDetails details ;
	public void select() {
		int select=0;
		System.out.println("Please choose 1.Registration 2.Retrieve your details 3.Exit ");
		select=sc.nextInt();
		switch (select) {
		case 1:
			register();
			break;
			
		case 2:
			getData();
			break;
		case 3:
			break;
		default:
			System.out.println("Please choose either 1 or 2");
			break;
		}
		
	}

	public void register() {
		    key++;
			details = new PersonDetails();
			list.add(details.toString());
            hashMap.put(key,list.toString());
           System.out.println("Your Details Are Successfully Added");
 		   System.out.println("Your Registion Id is : "+key);
            select();
	}
	public void getData() {
		System.out.println("Enter The Id : ");
        Integer i = sc.nextInt();
		Set set = hashMap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>)iterator.next();
			if(entry.getKey().equals(i)) {
			System.out.println(entry.getValue());
			}
		}
		select();
	}
	
     
}
