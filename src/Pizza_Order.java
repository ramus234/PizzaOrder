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
    public static String pizza6 = "Roma: Tomato, cheese, mushrooms";
    public static int price7 = 70;
    public static String pizza7 = "Spicy: Tomato, cheese, ham, chilli";
    public static int price8 = 80;
    public static String pizza8 = "Tomato Lover: Tomato";
    public static int price9 = 70;
    public static String pizza9 = "Cheese Lover: Cheese";
    public static int price10 = 80;
    public static String pizza10 = "Fisherman: Tomato, Cheese, Tuna";

    public static void main(String[] args) {

        //prompts the user for input
        System.out.println("Welcome to the restaurant, type 1 to show the menu. type any other key to exit");


        //first checks if the input is an integer, if it is, it checks if the integer = 1.
        // if the input = 1, it prints out the menu and sets the boolean to true to continue the program.
        // if any other character is typed, it exits the program.
        boolean next2 = false;
        int input = 0;
        boolean next = false;
        if (promptUser(1, 2, false) == 1) {
            printMenu();
            next = true;
        } else System.out.println("See you next time!");


        next2 = false;
        input = 0;
        //if the user has typed 1, continue with the order
        if (next) {
            do {
                System.out.println("Please chose the number you would like to order");
                input = promptUser(0, 11, true);
                if (input != -1) {
                    System.out.print("You have chosen number " + input + ": ");
                    next2 = true;
                }
            }
            while (!next2);
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
            System.out.println("Would you like any extra toppings? this will cost 5 DKK extra. you can order up to 1 of each topping");
            System.out.printf("0. No/Continue\n1. Garlic\n2. Ranch dressing\n3. Extra cheese");
            System.out.println();

            //these topping counters are for making sure that the user doesnt choose more than 1 of each topping
            int garlicCount = 0;
            int ranchCount = 0;
            int cheeseCount = 0;

            //the next scanner is in a while loop to allow the user to choose up to 3 different extra toppings
            while (next3) {
                next3 = false;
                next4 = false;

                toppingsInput = promptUser(0, 4, true);
                if (toppingsInput != -1) {
                    next3 = true;
                }
                if (next3) {
                    switch (toppingsInput) {
                        case 0:
                            next4 = true;
                            next3 = false;
                            break;
                        case 1:
                            if (garlicCount < 1) {
                                selectedTopping += ", garlic";
                                pizzaPrice += 5;
                                garlicCount++;
                            } else System.out.println("Don't you think that's enough garlic?");
                            break;
                        case 2:
                            if (ranchCount < 1) {
                                selectedTopping += ", ranch dressing";
                                pizzaPrice += 5;
                                ranchCount++;
                                break;
                            } else System.out.println("Don't you think that's enough ranch?");
                        case 3:
                            if (cheeseCount < 1) {
                                selectedTopping += ", extra cheese";
                                pizzaPrice += 5;
                                cheeseCount++;
                                break;
                            } else System.out.println("Don't you think that's enough cheese?");
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

                do {
                    in4input = promptUser(1,4,true);
                    if (in4input != -1) {
                        selectedSize = in4input;
                        next4 = true;
                    }
                }
                while (!next4);

                String pizzaSize = "";
                if (next4) {
                    switch (selectedSize) {
                        case 1:
                            pizzaSize = "standard size ";
                            break;
                        case 2:
                            pizzaPrice = pizzaPrice * 0.75;
                            pizzaSize = "child size ";
                            break;
                        case 3:
                            pizzaPrice = pizzaPrice * 1.50;
                            pizzaSize = "family size ";
                            break;
                    }
                    System.out.println("You have ordered a " + pizzaSize + selectedPizza + selectedTopping + " for the price of DKK " + pizzaPrice);
                }
            }
        }
    }

    //this function prints the menu out to the console
    public static void printMenu() {

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
        System.out.println();
    }

    //this function makes a new scanner,
    //and checks if the value inputted is within rangeStart and rangeEnd(exclusive) and is an integer.
    //if it is, it returns the input. if not, it returns -1.
    //if the boolean promptValid is set to true this function also prompts the user for
    //a valid input if the input is either out of range or not an integer

    public static int promptUser(int rangeStart, int rangeEnd, boolean promtValid) {

        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int input = in.nextInt();
            if (input >= rangeStart & input < rangeEnd) {
                return input;
            }
            else if(promtValid) System.out.println("Please input a valid number");

        }
        return -1;
    }
}

