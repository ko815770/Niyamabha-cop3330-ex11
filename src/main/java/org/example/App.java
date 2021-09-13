package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args) {
        double euro, rate;
        System.out.println("How many euros are you exchanging?");
        Scanner input = new Scanner(System.in);
        euro = input.nextDouble();
        System.out.println("What is the exchange rate?");
        rate = input.nextDouble();
        System.out.println(euro + "euros at an exchange rate of " + rate + " is\n" + String.format("%.2f",(euro * rate)) + " U.S. dollars.");
    }
}
