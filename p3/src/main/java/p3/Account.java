package p3;

import java.util.Scanner;
import java.util.Date;


public class Account {
	private int  id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	//constructors
	Account() {
		id = 0;
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