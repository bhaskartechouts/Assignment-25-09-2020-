package org.techouts.app.problem_2;


public class Address {

	String flatNumber;
	String village;
	String distict;
	String state ;
	String pincode;
	public Address(String flatNumber, String village, String distict, String state, String pincode) {
		super();
		this.flatNumber = flatNumber;
		this.village = village;
		this.distict = distict;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [flatNumber=" + flatNumber + ", village=" + village + ", distict=" + distict + ", state="
				+ state + ", pincode=" + pincode + "]";
	}
	
}
