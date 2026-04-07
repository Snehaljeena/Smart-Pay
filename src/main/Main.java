package main;
import java.util.*;

import model.Customer;
import bill.UtilityBillCalculator;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        UtilityBillCalculator billCalculator = new UtilityBillCalculator();

        while(true){
            System.out.println(" SmartPay Utility Biller ");
            System.out.println("1. Generate Bill");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice= sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.print("Enter Customer Name:");
                    String name=sc.nextLine();
                    System.out.println("Enter Previous Reading:");
                    int previousRead=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Current Reading:");
                    int currentRead = sc.nextInt();
                    sc.nextLine();
                    Customer customer=new Customer(name, previousRead, currentRead);
                    billCalculator.billGenerator(customer);
                    break;
                case 2:
                    System.out.println("Finished!!Exiting the application");
                    sc.close();
                    break;

                default:
                    System.out.println("Invalid choice"); 

            }
            

        }
       
       
    }
}
