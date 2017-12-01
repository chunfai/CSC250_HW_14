package com.example.joeli.csc250_hw_14;

/**
 * Created by Joeli on 1/12/2017.
 */

public class Patient extends Person
{
    private  double balance;

    public Patient(String FirstName, String LastName, int age, String gender, double balance)
    {
        super(FirstName, LastName, age, gender);
        this.balance = balance;
    }
    public String toString()
    {
        return String.format("%s Balance: %f", super.toString(), this.balance);
    }
}
