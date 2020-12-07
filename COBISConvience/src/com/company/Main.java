package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> product = new ArrayList<String>();
        ArrayList<Double> price = new ArrayList<Double>();
        ArrayList<String> order = new ArrayList<String>();
        ArrayList<Integer> amount = new ArrayList<Integer>();

        product.add("Red Hot Spicy Doritos");
        price.add(2.99);

        product.add("Cool Ranch Doritos");
        price.add(2.99);

        product.add("Coke");
        price.add(0.99);

        product.add("Diet Coke");
        price.add(0.99);

        product.add("Pepsi");
        price.add(0.99);

        product.add("Five Hour Energy");
        price.add(3.99);

        product.add("Sunflower Seeds");
        price.add(0.99);

        product.add("Peanuts");
        price.add(0.99);

        product.add("Mac Book Charger");
        price.add(120.00);

        product.add("Dell Charger");
        price.add(50.00);

        String answer1 = "";
        String answer2 = "";
        String receipt = "";
        double purchaseTotal = 0.0;
        double allTotal = 0.0;

        System.out.println("Hi! Welcome to our store! 'Enter' or 'Leave'");
        answer1 = input.nextLine();

        if (answer1.equalsIgnoreCase("Enter")) {
            System.out.print("You can choose from: \n Red Hot Spicy Doritos - $2.99 \n Cool Ranch Doritos - $2.99 \n Coke - $0.99 \n Diet Coke - $0.99 \n Pepsi - $0.99 \n Five Hour Energy - $3.99 \n Sunflower Seeds - $0.99 \n Peanuts - $0.99 \n Mac Book Charger - $120.00 \n Dell Charger - $50.00");
            order.clear();

            System.out.println("\nCustomer name ('Leave' to end the day):");
            while (!(answer2 = input.nextLine()).equalsIgnoreCase("Leave")) {
                receipt += "\n " + answer2 + " \n";
                purchaseTotal = 0;
                System.out.println("Enter product ('Check out' when purchase complete):");

                while (!(answer2).equalsIgnoreCase("Check out")) {
                    answer2 = input.nextLine();

                    for (String item : product) {
                        if (item.equals(answer2)) {
                            purchaseTotal += price.get(product.indexOf(item));
                            receipt += "\n" + answer2;

                            if (!order.contains(answer2)) {
                                order.add((answer2));
                                amount.add(1);

                            } else {
                                int index = order.indexOf(answer2);
                                amount.set(index, amount.get(index) + 1);

                            }
                            break;
                        }
                    }
                }
                receipt += "\n\t" + purchaseTotal + "\n";
                allTotal += purchaseTotal;
                System.out.println("Customer name('Leave' to end the day):");
            }
        } else {
            System.out.println("Thanks for shopping with us, have a nice day!");
        }
        System.out.println("Receipts: \n" + receipt);
        System.out.println("Purchase Total: ");
        for (String i : order) {
            System.out.println(i + " - " + amount.get(order.indexOf(i)));

        }
        System.out.println("\n Today's total: $" + allTotal);

    }
}