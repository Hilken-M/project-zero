/* What do we want in Menu?:
-We want a header to welcome the customer to the store (banner)
--public void printHeader()
-We want to print the main menu that lets the user know what their choices are
--printMenu()
-We need a scanner that looks for the customers' response to the main menu prompt
--requestInput()
-We want a method to ensure input from customer is acceptable and within the menu prompt parameters
--checkInput()
We probably want to output a confirmation of sorts to the customer
 */

package model;
import java.sql.SQLException;
import java.util.Scanner;

import MyCollection.ArrayList;
import dao.GroceryDAO;
import model.Grocery;
import services.GroceryService;

public class Menu {
    //
    Scanner keyboard = new Scanner(System.in);

    boolean exit;
    //ArrayList<GroceryDAO> shoppingCart = new ArrayList<>();
    GroceryService shoppingCart = new GroceryService();


    public void runMenu() throws SQLException {
        printHeader();
        while(!exit) {
            printMenu();
            int choice = requestInput();
            performMenuInput(choice);
        }
    }
    //
//    //Header (welcome sign)
    public void printHeader() {
        System.out.println("+----------------------------------------------+");
        System.out.println("|         Welcome to MaxFoods                  |");
        System.out.println("|           Specialty Store                    |");
        System.out.println("+----------------------------------------------+");
    }

////    Menus: list of inventory (item, qty, price), ask how many of the item they want, check out or continue,
////    and the last one leave (print the receipt) or quickly run back in and grab another item? (this will start the program over).
//            #Menus: 4
   public void printMenu(){
        System.out.println("Choice 1: Toilet Paper");
        System.out.println("Choice 2: Cat Tree");
        System.out.println("Choice 3: Sparkling Water");
        System.out.println("Choice 4: Green Power Ranger");
        System.out.println("Choice 5: Power Adaptor");
        System.out.println("Choice 6: Type 'C' power cable");
   }

    private int requestInput(){
        int choice = -1;
        do{
            System.out.println("Enter your choice for the item you would like to add to your cart: ");
            try{
                choice = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please only enter a number 1-6");
            }
            if (choice < 0 || choice > 6){
                System.out.println("Choice outside of range. Please enter a number from '1' to '6'");
            }
        } while(choice < 0 || choice > 6);
       return choice;
    }

//    private void selectQuantity(){
//
//    }

    private void performMenuInput(int choice) throws SQLException {
        switch (choice){
            case 0:
                System.out.println("Thank you for shopping at the MaxFoods Grocery Store, see you again soon!");
                System.exit(0);
                break;
            case 1:
                shoppingCart.getGrocery("Toilet Paper");
                System.out.println(choice);
                break;
            case 2:
                shoppingCart.getGrocery("Cat Tree");
                break;
            case 3:
                shoppingCart.getGrocery("Sparkling Water");
                break;
            case 4:
                shoppingCart.getGrocery("Green Power Ranger");
                break;
            case 5:
                shoppingCart.getGrocery("Power Adaptor");
                break;
            case 6:
                shoppingCart.getGrocery("Type C power cable");
                break;
            default:
                System.out.println("Unknown error has occurred.");
                break;
        }
    }


}
