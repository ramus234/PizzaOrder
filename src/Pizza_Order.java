import java.util.Scanner;

public class Pizza_Order {

    //defines the prices and names for all the pizzas. this is defined as a variable here as we will need it multiple times throughout the project
    public static int price1 = 50;
    public static String pizza1 = "Margherita: Tomato, cheese";
    public static int price2 = 60;
    public static String pizza2 = "Kebab; Tomato, cheese, lettuce";
    public static int price3 = 60;
    public static String pizza3 = "Hawaii: Tomato, cheese, pineapple";
    public static int price4 = 70;
    public static String pizza4 = "L.A: Tomato, cheese, ham, bacon";
    public static int price5 = 60;
    public static String pizza5 = "Torino: Tomato, cheese, sausage";
    public static int price6 = 80;
    public static String pizza6 = "Roma: Tomato, cheese, mushrooms, ";
    public static int price7 = 70;
    public static String pizza7 = "Spicy: Tomato, cheese, chilli";
    public static int price8 = 80;
    public static String pizza8 = "Tomato Lover: Tomato";
    public static int price9 = 70;
    public static String pizza9 = "Cheese Lover: Cheese";
    public static int price10 = 80;
    public static String pizza10 = "Fisherman: Tomato, Cheese, Tuna";


    public static void main(String[] args) {

        //initializes a new scanner, and prompts the user for input
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the restaurant, type 1 to show the menu. type any other key to exit");


        //first checks if the input is an integer, if it is, it checks if the integer = 1.
        // if the input = 1, it prints out the menu and sets the boolean to true to continue the program.
        // if any other character is typed, it exits the program.
        boolean next = false;
        if (in.hasNextInt()) {
            if (in.nextInt() == 1) {
                printMenu();
                next = true;
            } else System.out.println("See you next time!");
        } else System.out.println("See you next time!");

        boolean next2 = false;
        int input = 0;
        //if the user has typed 1, continue with the order
        if (next) {
            System.out.println("Please chose the number you would like to order");
            Scanner in2 = new Scanner(System.in);

            if (in2.hasNextInt()) {
                input = in2.nextInt();
                if (input > 0 & input < 11) {
                    System.out.print("You have chosen number " + input + ": ");
                    next2 = true;
                } else promptValidNum();
            } else promptValidNum();
        }

        double pizzaPrice = 0;
        String selectedPizza = "";

        if (next2) {
            switch (input) {
                case 1:
                    pizzaPrice = price1;
                    selectedPizza = pizza1;
                    break;
                case 2:
                    pizzaPrice = price2;
                    selectedPizza = pizza2;
                    break;
                case 3:
                    pizzaPrice = price3;
                    selectedPizza = pizza3;
                    break;
                case 4:
                    pizzaPrice = price4;
                    selectedPizza = pizza4;
                    break;
                case 5:
                    pizzaPrice = price5;
                    selectedPizza = pizza5;
                    break;
                case 6:
                    pizzaPrice = price6;
                    selectedPizza = pizza6;
                    break;
                case 7:
                    pizzaPrice = price7;
                    selectedPizza = pizza7;
                    break;
                case 8:
                    pizzaPrice = price8;
                    selectedPizza = pizza8;
                    break;
                case 9:
                    pizzaPrice = price9;
                    selectedPizza = pizza9;
                    break;
                case 10:
                    pizzaPrice = price10;
                    selectedPizza = pizza10;
                    break;
            }
            System.out.println(selectedPizza);

            boolean next3 = true;
            boolean next4 = true;
            int in3input = 0;
            int toppingsInput = 0;
            String selectedTopping = "";

            //prompts user if they would like any extra toppings
            System.out.println("Would you like any extra toppings? this will cost 5 DKK extra.");
            System.out.printf("0. No/Continue\n1. Garlic\n2. Ranch dressing\n3. Extra cheese");
            System.out.println();

            while (next3) {
                next3 = false;
                next4 = false;
                Scanner in3 = new Scanner(System.in);
                if (in3.hasNextInt()) {
                    in3input = in3.nextInt();
                    if (in3input > -1 & in3input < 4) {
                        toppingsInput = in3input;
                        next3 = true;
                        next4 = true;
                    } else promptValidNum();
                } else promptValidNum();

                if (next3) {
                    switch (toppingsInput) {
                        case 0:
                            next3 = false;
                            break;
                        case 1:
                            selectedTopping += ", garlic";
                            pizzaPrice += 5;
                            break;
                        case 2:
                            selectedTopping += ", ranch dressing";
                            pizzaPrice += 5;
                            break;
                        case 3:
                            selectedTopping += ", extra cheese";
                            pizzaPrice += 5;
                            break;
                    }

                    System.out.println("You have chosen " + selectedPizza + selectedTopping);
                }
            }
            if (next4) {

                System.out.println("Please chose the size of your pizza");
                System.out.printf("%-1s %-20s %-10s\n", "1.", "Standard size", "Price DKK " + pizzaPrice);
                System.out.printf("%-1s %-20s %-10s\n", "2.", "Child size ", "Price DKK " + pizzaPrice * 0.75);
                System.out.printf("%-1s %-20s %-10s\n", "3.", "Family size", "Price DKK " + pizzaPrice * 1.50);

                next4 = false;
                int in4input = 0;
                int selectedSize = 0;
                Scanner in4 = new Scanner(System.in);
                if (in4.hasNextInt()) {
                    in4input = in4.nextInt();
                    if (in4input > 0 & in4input < 4) {
                        selectedSize = in4input;
                        next4 = true;
                    } else promptValidNum();
                } else promptValidNum();

                String pizzaSize = "";
                if (next4) {
                    switch (selectedSize) {
                        case 1:
                            pizzaSize = "Standard size ";
                            break;
                        case 2:
                            pizzaPrice = pizzaPrice*0.75;
                            pizzaSize = "Child size ";
                            break;
                        case 3:
                            pizzaPrice = pizzaPrice*1.50;
                            pizzaSize = "Family size ";
                            break;


                    }
                    System.out.println("You have ordered a " + pizzaSize + selectedPizza + selectedTopping + " for the price of DKK " + pizzaPrice);
                }
                }
            }
        }


        //this function simply prints the menu out to the console
        public static void printMenu () {

            System.out.printf("%-1s %-40s %-10s\n", "1.", pizza1, "Price DKK " + price1);
            System.out.printf("%-1s %-40s %-10s\n", "2.", pizza2, "Price DKK " + price2);
            System.out.printf("%-1s %-40s %-10s\n", "3.", pizza3, "Price DKK " + price3);
            System.out.printf("%-1s %-40s %-10s\n", "4.", pizza4, "Price DKK " + price4);
            System.out.printf("%-1s %-40s %-10s\n", "5.", pizza5, "Price DKK " + price5);
            System.out.printf("%-1s %-40s %-10s\n", "6.", pizza6, "Price DKK " + price6);
            System.out.printf("%-1s %-40s %-10s\n", "7.", pizza7, "Price DKK " + price7);
            System.out.printf("%-1s %-40s %-10s\n", "8.", pizza8, "Price DKK " + price8);
            System.out.printf("%-1s %-40s %-10s\n", "9.", pizza9, "Price DKK " + price9);
            System.out.printf("%-1s %-39s %-10s\n", "10.", pizza10, "Price DKK " + price10);

        }

        //this function asks the user for a valid number when the user inputs an invalid one
        public static void promptValidNum () {
            System.out.println("Please input a valid number");
        }

    }
