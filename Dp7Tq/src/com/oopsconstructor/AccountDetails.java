package com.oopsconstructor;

class AccountInfo {
	int id;
	String name;
	double balance;

	AccountInfo() {
        this(121,"Bhaskar",1399.89);
	}

	AccountInfo(int id, String name,double balance) {
		this.id = id;
		this.name = name;
		this.balance=balance;
	}
	
	void display() {
		String name="ravi";
		System.out.println(name);
		System.out.println(this.name);
          this.info();
	}
	void info() {
		System.out.println(this.id+" "+this.name+" "+balance);
	}

}

public class AccountDetails {

	public static void main(String[] args) {
 
		AccountInfo acc=new AccountInfo();
		acc.display();
		AccountInfo acc1=new AccountInfo(122,"suraj",1200.90);
		acc1.display();
 	}

}
