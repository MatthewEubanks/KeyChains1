/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keychains1;

import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class Keychains1 {

    /**
     * @param args the command line arguments
     */
    public static int nmbrKeychains;
    public static int pricePerKeychain = 10;
    public static int choice;
    

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ye Olde Keychain Shoppe");
        System.out.println("1. Add Keychains to Order");
        System.out.println("2. Remove Keychains from Order");
        System.out.println("3. View Current Order");
        System.out.println("4. Checkout");
        
        boolean valid_input = false;
        while(!valid_input){
        System.out.print("\nPlease enter your choice: ");
        String temp_in = keyboard.next();
        if ("1234".indexOf(temp_in)!= -1){
            choice = Integer.parseInt(temp_in);
            valid_input = true;
        }
        }
        while (choice != 4) {
            switch (choice) {
                case 1:
                    add_keychains(nmbrKeychains);
                    choice = keyboard.nextInt();
                    break;
                case 2:
                    remove_keychains(nmbrKeychains);
                    choice = keyboard.nextInt();
                    break;
                case 3:
                    view_order(nmbrKeychains);
                    choice = keyboard.nextInt();
                    break;
                default:
                    break;
            }
        }
        checkout();
    }

    public static int add_keychains(int choice) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nYou have " + nmbrKeychains + " keychains. How many do you want to add? ");
        int addKeychains = keyboard.nextInt();

        //Calculation to add keychains
        nmbrKeychains = addKeychains + nmbrKeychains;

        System.out.println("You now have " + nmbrKeychains + " keychains.\n");
        System.out.println("Ye Olde Keychain Shoppe");
        System.out.println("1. Add Keychains to Order");
        System.out.println("2. Remove Keychains from Order");
        System.out.println("3. View Current Order");
        System.out.println("4. Checkout");
        System.out.print("\nPlease enter your choice: ");

        return nmbrKeychains;

    }

    public static int remove_keychains(int choice) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nYou have " + nmbrKeychains + " keychains. How many do you want to remove? ");
        int removeKeychains = keyboard.nextInt();

        //Calculation to subtract keychains
        nmbrKeychains = nmbrKeychains - removeKeychains;

        System.out.println("You now have " + nmbrKeychains + " keychains.\n");
        System.out.println("Ye Olde Keychain Shoppe");
        System.out.println("1. Add Keychains to Order");
        System.out.println("2. Remove Keychains from Order");
        System.out.println("3. View Current Order");
        System.out.println("4. Checkout");
        System.out.print("\nPlease enter your choice: ");

        return nmbrKeychains;

    }

    public static int view_order(int choice) {
        int totalCost = nmbrKeychains * pricePerKeychain;
        System.out.println("You now have " + nmbrKeychains + " keychains.\n");
        System.out.println("Keychains cost $" + pricePerKeychain + " each.");
        System.out.println("Total cost is $" + totalCost + ".\n");
        
        System.out.println("Ye Olde Keychain Shoppe");
        System.out.println("1. Add Keychains to Order");
        System.out.println("2. Remove Keychains from Order");
        System.out.println("3. View Current Order");
        System.out.println("4. Checkout");
        System.out.print("\nPlease enter your choice: ");

        return nmbrKeychains;
    }

    public static void checkout() {
        Scanner keyboard = new Scanner(System.in);
        int totalCost = nmbrKeychains * pricePerKeychain;
        System.out.println("\nCHECKOUT");
        System.out.print("What is your name? ");
        String name = keyboard.next();
        System.out.println("You now have " + nmbrKeychains + " keychains.\n");
        System.out.println("Keychains cost $" + pricePerKeychain + " each.");
        System.out.println("Total cost is $" + totalCost + ".\n");
        System.out.println("Thanks for your order, " + name + "!");
        
    }

}
