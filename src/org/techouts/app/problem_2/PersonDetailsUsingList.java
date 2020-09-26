package org.techouts.app.problem_2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonDetailsUsingList {

	String name;
	int age;
	Address address ;
	int key ;
	List<Address> list = new LinkedList<Address>();
	Map<Integer, PersonDetailsUsingList> list2 = new HashMap<>();
	String gender;
    Scanner sc = new Scanner(System.in);
    public PersonDetailsUsingList() {
	}
	public PersonDetailsUsingList(String name, int age, Address address, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.list.add(address);
	}
	@Override
	public String toString() {
		return "PersonDetailsUsingList [name=" + name + ", age=" + age + ", list=" + list + ", gender=" + gender + "]";
	}
	public void add() {
		   key++;
		   System.out.println("Enter The Name : ");
	       this.name = sc.next();
	       System.out.println("Enter The Age : ");
	       this.age = sc.nextInt();
	       System.out.println("Enter The Address In Below Format : ");
	       System.out.println();
	       System.out.println("Enter The flatNumber : ");
		   String flatNumber = sc.next();
		   System.out.println("Enter The village : ");
		   String village = sc.next();
		   System.out.println("Enter The distict : ");
		   String distict = sc.next();
		   System.out.println("Enter The State : ");
		   String state = sc.next();
		   System.out.println("Enter The pincode : ");
		   String pincode = sc.next();
		   PersonDetailsUsingList list = new PersonDetailsUsingList(name, age,new Address(flatNumber, village, distict,state, pincode), gender);
		   list2.put(key, list);
		   System.out.println("Your Details Are Successfully Added");
		   System.out.println("Your Registion Id is : "+key);
		select();
	}
	public void select() {
		int select=0;
		System.out.println("Please choose 1.AddingData 2.Retrieve your details 3.Exit");
		select=sc.nextInt();
		switch (select) {
		case 1:
			add();
			break;
			
		case 2:
			retrieve();
			break;
		case 3:
			break;
		default:
			System.out.println("Please choose either 1 or 2 or 3");
			break;
		}
		
	}
	private void retrieve() {
    
		System.out.println("Enter The Id : ");
	    int key = sc.nextInt();
	    System.out.println(list2.get(key));
	    select();
		
	}
	
}
