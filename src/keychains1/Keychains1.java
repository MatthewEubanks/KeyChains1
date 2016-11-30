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
        System.out.print("\nPlease enter your choice: ");
        choice = keyboard.nextInt();

        while (choice != 4) {
            if (choice == 1) {
                add_keychains(nmbrKeychains);

                System.out.println("Ye Olde Keychain Shoppe");
                System.out.println("1. Add Keychains to Order");
                System.out.println("2. Remove Keychains from Order");
                System.out.println("3. View Current Order");
                System.out.println("4. Checkout");
                System.out.println("\nPlease enter your choice: ");
                choice = keyboard.nextInt();

            } else if (choice == 2) {
                remove_keychains(nmbrKeychains);
                System.out.println("Ye Olde Keychain Shoppe");
                System.out.println("1. Add Keychains to Order");
                System.out.println("2. Remove Keychains from Order");
                System.out.println("3. View Current Order");
                System.out.println("4. Checkout");
                System.out.println("\nPlease enter your choice: ");
                choice = keyboard.nextInt();
            } else if (choice == 3) {
                view_order();

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
        choice = keyboard.nextInt();
        return nmbrKeychains;

    }

    public static int remove_keychains(int nmbrKeychains) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nYou have " + nmbrKeychains + " keychains. How many do you want to remove? ");
        int removeKeychains = keyboard.nextInt();
        
        //Calculation to subtract keychains
        nmbrKeychains = nmbrKeychains - removeKeychains;
        System.out.println("You now have " + nmbrKeychains + " keychains.\n");
        return nmbrKeychains;

    }

    public static void view_order() {
        System.out.println("\nVIEW ORDDER\n");
    }

    public static void checkout() {
        System.out.println("\nCHECKOUT");
    }

}
