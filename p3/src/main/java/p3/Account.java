package p3;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Date;

public class Account {
	private int  id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	private int customer = ThreadLocalRandom.current().nextInt(0, 9999 + 1);
	//creates a new account with a number besides zero
	
	//constructors
	Account() {
		id = customer;
		balance = 0;
		annualInterestRate = 0;
	}
	
	Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	

	//accessor methods
	public double getMonthlyInterestRate(){
		return (annualInterestRate / 12);
	}
	
	public int getid(){
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
	balance = this.balance;
	}
	public void setid(int id) {
	id = this.id;
	}
	public void setannualInterestRate(double annualInterestRate) {
	annualInterestRate = this.annualInterestRate;
	}	
	
	
	
	
	
	//deposit and withdraw methods
	private double withdraw(double remove){
		return balance -= remove;
	}
	double deposit(double add){
		return balance += add;
	}
	
	
}