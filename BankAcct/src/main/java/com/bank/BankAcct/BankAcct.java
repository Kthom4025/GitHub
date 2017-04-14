package com.bank.BankAcct;


public class BankAcct {

  private double balance;

  public BankAcct(double balance) {
    this.balance = balance;
  }

  public double debit(double amount) {
    if (balance < amount) {
      amount = balance;
    }

    balance -= amount;
    return amount;
  }

}