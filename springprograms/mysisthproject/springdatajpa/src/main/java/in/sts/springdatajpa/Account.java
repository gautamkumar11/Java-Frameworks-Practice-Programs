package in.sts.springdatajpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@Column(name = "accountnumber")
	 private int accountNumber;  
	 private String owner;  
	 private double balance;
	 
	public Account(int accountNumber, String owner, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}  
}
