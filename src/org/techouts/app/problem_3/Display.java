package org.techouts.app.problem_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Display {

	 static Scanner scanner = new Scanner(System.in);
	 String name;
	 static List<Integer>
	         storeBadmintonData = new LinkedList<Integer>(),
			 storeFootballData = new LinkedList<>(),
			 storeBoxCricketData = new LinkedList<>()
			 ;
	 static List<String> list = new ArrayList<>(),
			             list2 = new ArrayList<>(), 
			             list3 = new ArrayList<String>();
	 public void show() {
		 System.out.println("Enter The Name : ");
		 name = scanner.next();
		 System.out.println("1. Bandminton");
		 System.out.println("2. Football");
		 System.out.println("3. Box Cricket");
		 System.out.println();
		 System.out.println("Enter The Sports Number : ");
		 int sportsNumber = scanner.nextInt();
		 switch(sportsNumber) {
		 case 1 : 
			 Badminton badminton = new Badminton();
			 badminton.book();
			 break;
		 case 2 :
			 Football football = new Football();
			 football.book();
			 break;
		 case 3 :
			 BoxCricket boxCricket = new BoxCricket();
			 boxCricket.book();
			 break;
		 default :
			 System.out.println("Enter Correct Option ");
			 show();
			 break;
		 }
	 }
	 public void slots() {
		 int j =9,k = 9,l = 9;
		 for(int i = 1 ; i <= 10 ; i++) {
			 list.add(i+") "+j+":00"+" to " + (j+1) +":00");
			 j++;
		 }
		 for(int i = 1 ; i <= 20 ; i++) {
			 if(i%2 == 1) {
			 list2.add(i+") "+k+":00"+" to " + (k) +":30");
			 }
			 else {
				 list2.add(i+") "+k+":30"+" to " + (k+1) +":00");
				 k++;
			 }
			 
		 }
		 for(int i = 1 ; i <= 5 ; i++) {
			 list3.add(i+") "+l+":00"+" to " + (l+2) +":00");
			 l++;
		 }
		 for(int i = 1 ; i <= 10 ; i++) {
			 storeBadmintonData.add(i);
		 }
		 for(int i = 1 ; i <= 20 ; i++) {
			 storeFootballData.add(i);
		 }
		 for(int i = 1 ; i <= 5 ; i++) {
			 storeBoxCricketData.add(i);
		 }
	 }
	 
}
