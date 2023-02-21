package Conditionals;

import java.util.Scanner;

public class Profit_loss {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter Cost price:");
        int Cost_price= num.nextInt();
        System.out.println("Enter Selling price:");
        int Selling_price= num.nextInt();

        int amount;

        if(Cost_price>Selling_price){
            amount=Cost_price-Selling_price;
            System.out.println("The loss is="+amount);
        } else if (Cost_price<Selling_price) {
            amount=Selling_price-Cost_price;
            System.out.println("The profit is="+amount);
        }
        else{
            System.out.println("No profit no loss");
        }
    }
}
