import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables for today's coffee and its price
        String coffee = "";
        double price = 0.0;
        String specials = "";

        // Loop to keep asking for a weekday if the user enters a weekend day
        while (true) {
            // Prompt the user for the day of the week
            System.out.print("Please enter a day of the week (Monday - Friday only!): ");
            specials = input.next();

            // Check if the input is a valid weekday (Monday to Friday)
            if (specials.equalsIgnoreCase("Saturday") || specials.equalsIgnoreCase("Sunday")) {
                System.out.println("Please enter a weekday, not weekend!");
            } else {
                break;  // Exit the loop if it's a valid weekday
            }
        }

        // Determine today's coffee special and price based on the day
        switch (specials) {
            case "Monday":
                coffee = "Latte";
                price = 4.95;
                break;
            case "Tuesday":
                coffee = "Frapp";
                price = 4.95;
                break;
            case "Wednesday":
                coffee = "Cappuccino";
                price = 4.35;
                break;
            case "Thursday":
                coffee = "Regular Joe";
                price = 2.95;
                break;
            case "Friday":
                coffee = "Green Tea Latte";
                price = 6.95;
                break;
            default:
                // This block should never be reached due to the loop validation
                System.out.println("Invalid day entered. Please run the program again and enter Monday through Friday.");
                input.close();
                return;
        }

        // Display the coffee special of the day
        System.out.printf("%s's coffee of the day is a %s and the price will be $%.2f%n", specials, coffee, price);

        // Ask the user how many drinks they would like
        System.out.print("How many " + coffee + "(s) would you like? ");
        int count = input.nextInt();

        // Handle different cases for the quantity entered
        if (count == 0) {
            System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
        } else if (count == 1) {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
        } else {
            double total = count * price;
            System.out.printf("You ordered %d %ss. Your total is $%.2f.%n", count, coffee, total);
        }

        input.close();
    }
}
