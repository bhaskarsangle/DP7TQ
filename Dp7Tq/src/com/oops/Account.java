package com.oops;

class Bank {
	private int id;
	private String name;
	private double balance;
	private String status;

	public Bank(int id, String name, double balance, String status) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.status = status;
	}

	public Bank() {
	 
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", balance=" + balance + ", status=" + status + "]";
	}

}

public class Account {

	static void checkStatus(Bank b) {
		if (b.getBalance() > 0) {
			b.setStatus("Active");
		}
	}

	public static void main(String[] args) {

		Bank bank1 = new Bank(121, "bhaskar", 23900.90, "deactivate");
		Bank bank2 = new Bank(122, "ram", 20900.90, "deactivate");
		Bank bank3 = new Bank(123, "rupesh", 34000.10, "deactivate");
		Bank bank4 = new Bank(124, "om", 675400.90, "deactivate");

		System.out.println(bank1);
		System.out.println(bank2);
		System.out.println(bank3);
		System.out.println(bank4);
		
		
		System.out.println("============after checking balance");

		checkStatus(bank1);
		checkStatus(bank2);
		checkStatus(bank3);
		checkStatus(bank4);

		System.out.println(bank1);
		System.out.println(bank2);
		System.out.println(bank3);
		System.out.println(bank4);

	}

}
