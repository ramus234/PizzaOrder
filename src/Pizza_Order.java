import java.util.Scanner;

public class Pizza_Order {

    //defines the prices for all the pizzas. this is defined as a variable here as we will need it multiple times throughout the project
    public static int price1 = 50;
    public static int price2 = 60;
    public static int price3 = 60;
    public static int price4 = 70;
    public static int price5 = 60;
    public static int price6 = 80;
    public static int price7 = 70;
    public static int price8 = 80;
    public static int price9 = 70;
    public static int price10 = 80;


    public static void main(String[] args) {

        //initializes a new scanner, and prompts the user for input
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the restaurant, type 1 to show the menu. type any other key to exit");

        //first checks if the input is an integer, if it is, it checks if the integer = 1. if the input = 1, it prints out the menu if any other character is typed, it exits the program
        boolean hasTypedOne = false;
        if (in.hasNextInt()) {

            if (in.nextInt() == 1) {
                printMenu();
                hasTypedOne = true;
            }

        } else System.out.println("See you next time!");



        int chosenPizza = 0;
        //if the user has typed one, continue with the order

        if (hasTypedOne) {
            System.out.println("Please chose the number you would like to order");
            Scanner in2 = new Scanner(System.in);

            if (in2.hasNextInt()) {
                int input = in2.nextInt();
                if (input > 0 & input < 11) chosenPizza = input;


            }
            System.out.println("You have chosen " + chosenPizza);



        }


    }


    //this function simply prints the menu out to the console
    public static void printMenu() {

        System.out.printf("%-1s %-40s %-10s\n", "1.", "Margherita: Tomato, cheese", "Price DKK " + price1);
        System.out.printf("%-1s %-40s %-10s\n", "2.", "Kebab; Tomato, cheese, lettuce", "Price DKK " + price2);
        System.out.printf("%-1s %-40s %-10s\n", "3.", "Hawaii: Tomato, cheese, pineapple", "Price DKK " + price3);
        System.out.printf("%-1s %-40s %-10s\n", "4.", "L.A: Tomato, cheese, ham, bacon", "Price DKK " + price4);
        System.out.printf("%-1s %-40s %-10s\n", "5.", "Torino: Tomato, cheese, sausage", "Price DKK " + price5);
        System.out.printf("%-1s %-40s %-10s\n", "6.", "Roma: Tomato, cheese, mushrooms, ", "Price DKK " + price6);
        System.out.printf("%-1s %-40s %-10s\n", "7.", "Spicy: Tomato, cheese, chilli", "Price DKK " + price7);
        System.out.printf("%-1s %-40s %-10s\n", "8.", "Tomato Lover: Tomato", "Price DKK " + price8);
        System.out.printf("%-1s %-40s %-10s\n", "9.", "Cheese Lover: Cheese", "Price DKK " + price9);
        System.out.printf("%-1s %-39s %-10s\n", "10.", "Fisherman:, Tomato, Cheese, Tuna", "Price DKK " + price10);

    }
}
