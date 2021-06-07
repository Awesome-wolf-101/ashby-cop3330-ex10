/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Calendar;
import java.util.Scanner;

public class APP {


    public static void main(String[] args) {
        final double TaxConstant = 0.055;
        System.out.println("Enter the price of item 1:");
        Scanner sc = new Scanner(System.in);
        String PriceOfItem1 = sc.nextLine();
        System.out.println("Enter the quantity of item 1:");
        String QuantityOfItem1 = sc.nextLine();
        System.out.println("Enter the price of item 2:");
        String PriceOfItem2 = sc.nextLine();
        System.out.println("Enter the quantity of item 2:");
        String QuantityOfItem2 = sc.nextLine();
        System.out.println("Enter the price of item 3:");
        String PriceOfItem3 = sc.nextLine();
        System.out.println("Enter the quantity of item 3:");
        String QuantityOfItem3 = sc.nextLine();

        double PriceOfItem1Double = Double.parseDouble(PriceOfItem1);
        double QuantityOfItem1Double = Double.parseDouble(QuantityOfItem1);
        double PriceOfItem2Double = Double.parseDouble(PriceOfItem2);
        double QuantityOfItem2Double = Double.parseDouble(QuantityOfItem2);
        double PriceOfItem3Double = Double.parseDouble(PriceOfItem3);
        double QuantityOfItem3Double = Double.parseDouble(QuantityOfItem3);

        double SubTotal = (PriceOfItem1Double * QuantityOfItem1Double) + (PriceOfItem2Double * QuantityOfItem2Double) + (PriceOfItem3Double * QuantityOfItem3Double);
        double Tax = SubTotal * TaxConstant;
        double ActualTotal = SubTotal + Tax;
        System.out.println("Subtotal: $" + SubTotal);
        System.out.println("Tax: $" + Tax);
        System.out.println("ActualTotal: $" + ActualTotal);




    }
}
