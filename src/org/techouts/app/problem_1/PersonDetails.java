package org.techouts.app.problem_1;

import java.util.Scanner;

public class PersonDetails {

	Scanner sc = new Scanner(System.in);
	String name ;
	int age;
	String gender;
    String contact;
    String Address;
	public PersonDetails() {
       System.out.println("Enter The Name : ");
       this.setName(sc.nextLine());
       System.out.println("Enter The Age : ");
       this.setAge(sc.nextInt());
       System.out.println("Enter The Gender : ");
       this.setGender(sc.next());
       System.out.println("Enter The Contact : ");
       this.setContact(sc.next());
       System.out.println("Enter The Address : ");
       sc.nextLine();
       this.setAddress(sc.nextLine());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "PersonDetails name=" + name + ", age=" + age + ", gender=" + gender + ", contact="
				+ contact + ", Address=" + Address;
	}
	
}
