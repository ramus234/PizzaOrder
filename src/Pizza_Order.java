import java.util.Scanner;

public class Pizza_Order {

    //defines the prices and names for all the pizzas. this is defined as a variable here as we will need it multiple times throughout the project
    static int price1 = 50;
    static String pizza1 = "Margherita: Tomato, cheese";
    static int price2 = 60;
    static String pizza2 = "Kebab; Tomato, cheese, lettuce";
    static int price3 = 60;
    static String pizza3 = "Hawaii: Tomato, cheese, pineapple";
    static int price4 = 70;
    static String pizza4 = "L.A: Tomato, cheese, ham, bacon";
    static int price5 = 60;
    static String pizza5 = "Torino: Tomato, cheese, sausage";
    static int price6 = 80;
    static String pizza6 = "Roma: Tomato, cheese, mushrooms";
    static int price7 = 70;
    static String pizza7 = "Spicy: Tomato, cheese, ham, chilli";
    static int price8 = 80;
    static String pizza8 = "Tomato Lover: Tomato";
    static int price9 = 70;
    static String pizza9 = "Cheese Lover: Cheese";
    static int price10 = 80;
    static String pizza10 = "Fisherman: Tomato, Cheese, Tuna";

    public static void main(String[] args) {

        boolean next = false;
        //prompts the user for the menu
        System.out.println("Welcome to the restaurant, type 1 to show the menu. type any other key to exit");
        if (promptUser(1, 2, false) == 1) {
            printMenu();
            next = true;
        } else System.out.println("See you next time!");

        int pizzaInput = 0;
        //if the user has typed 1, continue with the order
        while (next) {
            System.out.println("Please chose the number you would like to order");
            pizzaInput = promptUser(0, 11, true);
            //-1 is my error code for the promptUser method. so if it doesn't return -1, the input is valid,
            //and the while loop can be broken.
            if (pizzaInput != -1) {
                System.out.print("You have chosen number " + pizzaInput + ": ");
                break;
            }
        }
        double pizzaPrice = 0;
        String selectedPizza = "";
        if (next) {
            switch (pizzaInput) {
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

            //prompts user if they would like any extra toppings
            System.out.println("Would you like any extra toppings? this will cost 5 DKK extra. you can order up to 1 of each topping");
            System.out.printf("0. No/Continue\n1. Garlic\n2. Ranch dressing\n3. Extra cheese\n");

            String selectedTopping = "";
            int toppingsInput = 0;

            //these topping counters are for making sure that the user doesnt choose more than 1 of each topping
            int garlicCount = 0;
            int ranchCount = 0;
            int cheeseCount = 0;

            //the next scanner allows the user to choose up to 3 different extra toppings
            while (next) {
                toppingsInput = promptUser(0, 4, true);
                if (toppingsInput == 0) break;
                switch (toppingsInput) {
                    //if any of the counters are less than 1, the user is allowed to chose that topping. if they do,
                    //the topping will be added to the selectedTopping string and the pizzaPrice will be incremented by 5
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
                        } else System.out.println("Don't you think that's enough ranch?");
                        break;
                    case 3:
                        if (cheeseCount < 1) {
                            selectedTopping += ", extra cheese";
                            pizzaPrice += 5;
                            cheeseCount++;
                        } else System.out.println("Don't you think that's enough cheese?");
                        break;
                }
                System.out.println("You have chosen " + selectedPizza + selectedTopping);
            }
            System.out.println("Please chose the size of your pizza");
            System.out.printf("%-1s %-20s %-10s\n", "1.", "Standard size", "Price DKK " + pizzaPrice);
            System.out.printf("%-1s %-20s %-10s\n", "2.", "Child size ", "Price DKK " + pizzaPrice * 0.75);
            System.out.printf("%-1s %-20s %-10s\n", "3.", "Family size", "Price DKK " + pizzaPrice * 1.50);

            String pizzaSize = "";

            //this scanner asks the user for the size of the pizza, and adjusts the pizzaPrice and pizzaSize accordingly
            while (next) {
                int sizeInput = promptUser(1, 4, true);
                if (sizeInput != -1) {
                    int selectedSize = sizeInput;
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
                    break;
                }
            }
            //at last the receipt is printed out
            System.out.println("You have ordered a " + pizzaSize + selectedPizza + selectedTopping + " for the price of DKK " + pizzaPrice);
        }
    }

    /**
     * This function prints the menu out to the console
     */

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

    /**
     * this function makes a new scanner
     * and checks if the value inputted is within rangeStart and rangeEnd(exclusive) and is an integer.
     * if it is, it returns the input. if not, it returns -1.
     * if the boolean promptValid is set to true this function also prompts the user for
     * a valid input if the input is either out of range or not an integer
     *
     * @param rangeStart  the int range start
     * @param rangeEnd    the int range end
     * @param promptValid the boolean if the method should prompt for valid input
     * @return int returns the input. -1 if invalid input
     */
    public static int promptUser(int rangeStart, int rangeEnd, boolean promptValid) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int input = in.nextInt();
            if (input >= rangeStart & input < rangeEnd) {
                return input;
            } else if (promptValid) System.out.println("Please input a valid number");
        } else if (promptValid) System.out.println("Please input a valid number");
        return -1;
    }
}

//Tested by Jonas