package org.techouts.app.problem_3;

public class BoxCricket extends Display{

	public void book() {
		System.out.println("BoxCricket");
		for(int i = 0;i < list3.size();i++) {

			System.out.print(list3.get(i)+" ");

		}
		System.out.println();
		System.out.println();
		System.out.println("There are Avaliable");
		System.out.println();
		for(int i : storeBoxCricketData) { 
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Select the Slot Number ");
		int key = scanner.nextInt();
		System.out.println("Hi "+name+" Successfully Book Your Slot Number "+ key );
		int index = key-1;
		storeBoxCricketData.remove(index);
		System.out.println("Do You Want 1.Continue or 2.Terminated ");
		System.out.println("Select The Number : ");
		int i = scanner.nextInt();
		if(i == 1) {
			show();
		}
	}
}
