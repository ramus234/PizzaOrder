import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the restaurant, type 1 to show the menu. type any other key to exit");

        if (in.hasNextInt()) {

            if (in.nextInt() == 1) printMenu();

            }
        else System.out.println("?");
        }


    //this function simply prints the menu out to the console
    public static void printMenu() {

        System.out.printf("%-1s %-40s %-10s\n", "1.", "Margherita: Tomato, cheese", "Price DKK 50");
        System.out.printf("%-1s %-40s %-10s\n", "2.", "Kebab; Tomato, cheese", "Price DKK 60");
        System.out.printf("%-1s %-40s %-10s\n", "3.", "s", "");
        System.out.printf("%-1s %-40s %-10s\n", "4.", "", "");
        System.out.printf("%-1s %-40s %-10s\n", "5.", "", "");
        System.out.printf("%-1s %-40s %-10s\n", "6.", "", "");
        System.out.printf("%-1s %-40s %-10s\n", "7.", "", "");
        System.out.printf("%-1s %-40s %-10s\n", "8.", "", "");
        System.out.printf("%-1s %-40s %-10s\n", "9.", "", "");
        System.out.printf("%-1s %-40s %-10s\n", "10.", "", "");
    }
}
