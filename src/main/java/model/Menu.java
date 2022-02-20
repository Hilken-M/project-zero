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
//package model;
//import java.util.Scanner;
//
//public class Menu {
//
//    Scanner keyboard = new Scanner(System.in);
//
//    //Header (welcome sign)
//    public void printHeader(){
//        System.out.println("+----------------------------------------------+");
//        System.out.println("|         Welcome to MaxFoods                  |");
//        System.out.println("|           Specialty Store                    |");
//        System.out.println("+----------------------------------------------+");
//    }
////    Menus: list of inventory (item, qty, price), ask how many of the item they want, check out or continue,
////    and the last one leave (print the receipt) or quickly run back in and grab another item? (this will start the program over).
////            #Menus: 4
//    public void printMenu(){
//        System.out.println("Choice: 1");
//        System.out.println("Choice: 2");
//        System.out.println("Choice: 3");
//        System.out.println("Choice: 4");
//        System.out.println("Choice: 5");
//        System.out.println("Choice: 6");
//    }
//
//    private int requestInput(){
//        int choice = -1;
//        do{
//            System.out.println("Enter your choice: ");
//            try{
//                choice = Integer.parseInt(keyboard.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid selection. Please only enter a number x-X");
//            }
//            if (choice < 0 || choice > 6){
//                System.out.println("Choice outside of range. Please enter a number from '1' to '6'");
//            }
//        } while(choice < 0 || choice > 6);
//        return choice;
//    }
//
//    private void performMenuInput(){
//        switch (choice){
//            case 0:
//                System.out.println("Thank you for shopping at the MaxFoods Grocery Store, see you again soon!");
//                break;
//            case 1:
//                method1();
//                break;
//            case 2:
//                method2();
//                break;
//            case 3:
//                method3();
//                break;
//            case 4:
//                method4();
//                break;
//            case 5:
//                method5();
//                break;
//            case 6:
//                method6();
//                break;
//        }
//    }


//}
