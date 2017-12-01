package com.example.joeli.csc250_hw_14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person[] persons = new Person[4];
        persons[0] = new Patient("Joe", "Li", 25, "male", 100);
        persons[1] = new Patient("Tom", "Li", 39, "male", 200);
        persons[2] = new Patient("Mary", "Li", 35, "female", 300);
        persons[3] = new Patient("joe", "Li", 37, "male", 400);

        //Arrays.sort(persons);

        this.printArray(persons);
    }

    private void printArray(Person[] p)
    {
        for(int i = 0; i <p.length; i++)
        {
            System.out.println(p[i]);
        }
    }
}
