package companyName.com.Hibernate_Day3.entity;

public class Customer {

	private int srno;
	private String fname,lname,address;
	
	public Customer() {
		super();
	}

	
	public Customer(int srno) {
		super();
		this.srno = srno;
	}

	

	public Customer(String fname, String lname, String address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}


	public Customer(int srno, String fname, String lname, String address) {
		super();
		this.srno = srno;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", address=" + address + "]";
	}
	
	
}
