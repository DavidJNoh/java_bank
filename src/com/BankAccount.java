package com;

public class BankAccount {
	private String accountNumber;
	private double checking;
	private double savings;
    private static int numberOfAccounts = 0;
    private double total;
	
    public BankAccount() {
		accNumberGenerator();
		numberOfAccounts++;
	}
    
	private void accNumberGenerator() {
		 accountNumber = "ewfawefawefw";
	}
	public double getChecking() {
		return this.checking;
	}
	public double getSavings() {
		return this.savings;
	}
	public double getTotal() {
		return this.total;
	}
	public void setChecking(double deposit) {
		this.checking+= deposit;
		this.total+= deposit;

	}
	public void setSavings(double deposit) {
		this.savings+= deposit;
		this.total+= deposit;
	}
	
	//withdraw
	
	public void drawChecking(double deposit) {
		if (this.checking < deposit) {
			System.out.println("You can not overdraw from your checking account");
		}
		else {
			this.checking -= deposit;
		}
	}
	public void drawSavings(double deposit) {
		if (this.savings < deposit) {
			System.out.println("You can not overdraw from your savings account");
		}
		else {
			this.savings -= deposit;
		}
	}
	
}
