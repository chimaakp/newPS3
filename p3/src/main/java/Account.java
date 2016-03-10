package p3;

import java.util.Scanner;
import java.util.Date;


public class Account {
	private int  id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	//constructors
	Account() {
	
	}
	
	Account(int id, double balance) {
		private int id = id;
		private double balance = balance;
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
	
	public double getdateCreated(){
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