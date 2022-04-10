package com.company;

public class Main {

    public static void main(String[] args)
    {

	double itemPrice = 32.14;
    double afterTax = itemPrice * 0.05 + itemPrice;

    System.out.println("Yout Item cost " + itemPrice + "$. After tax your Item costs " + afterTax + "$");
    }
}
