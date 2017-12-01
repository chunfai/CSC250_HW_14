package com.example.joeli.csc250_hw_14;

/**
 * Created by Joeli on 30/11/2017.
 */

public class Person
{
    protected String FirstName;
    protected String LastName;
    protected int age;
    protected String gender;

    public Person(String FirstName, String LastName, int age, String gender)
    {
        this.FirstName = FirstName;
        this. LastName = LastName;
        this.age = age;
        this.gender = gender;
    }



    //public int compareTo(Person p)
    //{
        //return this.FirstName.compareToIgnoreCase(p.FirstName);
        //return this.age - p.age;

       // if(this.age == p.age)
       // {
           // return 0;
        //}
       // else if(this.age < p.age)
        //{
        //    return -1;
        //}
        //else
        //{
        //    return 1;
        //}

   // }

    public String toString()
    {
        //return this.FirstName + "  "  +this.LastName +"age:" + this.age + "gender:" +this.gender;
        return String.format("%s  %s age: %d gender: %s ", this.FirstName, this.LastName, this.age, this.gender);


    }
}
