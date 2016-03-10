package p3;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Date;

public class Account {
	private int  id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	private int customer = ThreadLocalRandom.current().nextInt(0, 6000 + 1);
	//creates a new account with a number besides zero
	
	//constructors
	Account() {
		id = customer;
		balance = 0;
		annualInterestRate = 0;
	}
	
	Account(int newid, double newbalance, double newannualInterestRate) {
		id = newid;
		balance = newbalance;
		annualInterestRate = newannualInterestRate;
	}
	

	//accessor methods
	public double getMonthlyInterestRate(){
		return (annualInterestRate / 12);
	}
	
	public double getid(){
		return id;
	}

	public double getbalance(){
		return balance;
	}
	
	public double getannualInterestRate(){
		return annualInterestRate;
	}
	
	public Date getdateCreated(){
		return dateCreated;
	}
	
	
	
	
	//mutator methods
	public void setbalance(double balance) {
	this.balance = balance;
	}
	public void setid(int id) {
	this.id = id;
	}
	public void setannualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
	}	
	public void setannualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
	}
	
	
	
	
	//deposit and withdraw methods
	private double withdraw(double remove){
		return balance -= remove;
	}
	private double deposit(double add){
		return balance += add;
	}
}