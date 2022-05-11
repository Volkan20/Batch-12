package com.syntax.class33;

public class Account {

    double balance;

    public void setBalance(double balance) {
        throw new InsufficientBalance("can't set negative balance");
    }
}
