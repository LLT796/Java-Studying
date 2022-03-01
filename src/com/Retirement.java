package com;

import java.util.Scanner;

/**
 * This program demonstrate a <code>while</code>loop
 * @version 1.20 2022-2-22
 * @author LLT
 */

public class Retirement {
    public static void main(String[] args)
    {
        //read inputs
        Scanner in=new Scanner(System.in);

        System.out.print("How much money do you need to retire? ");
        double goal=in.nextDouble();

        System.out.print("How much money will you contribute every year? ");
        double payment=in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate=in.nextDouble();

        double balance=0;
        int year=0;

        //update account balance payment and interest
        while(balance<goal)
        {
            //add this year's payment and interest
            balance+=payment;
            double interest=balance*interestRate/100;
            balance+=interest;
            year++;
        }
        System.out.println("You can retire in "+year+" year.");


    }

}
