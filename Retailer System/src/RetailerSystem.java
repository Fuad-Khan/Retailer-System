import java.util.Scanner;

public class RetailerSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int item1Price = 100;
        int item2Price = 200;
        int item3Price = 350;
        int item4Price = 500;
        int item5Price = 350;

        int item1Quantity = 650; // set initial quantity
        int item2Quantity = 300; // set initial quantity
        int item3Quantity = 350; // set initial quantity
        int item4Quantity = 100; // set initial quantity
        int item5Quantity = 70; // set initial quantity

        double totalPurchase = 0;

        System.out.println("Food Accessories=  100 Taka pieces.");
        System.out.println("Home Accessories =   200 Taka pieces.");
        System.out.println("Books =   350 Taka pieces.");
        System.out.println("Electric Parts =   500 Taka pieces.");
        System.out.println("Cloth =    250 Taka pieces.");

        // create account
        System.out.println("To start shopping,");
        System.out.println("First create your account.");
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        System.out.println("Account created successfully!");

        boolean isDoneShopping = false;
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.print("Please enter your email address: ");
            String enteredEmail = scanner.nextLine();
            System.out.print("Please enter your password: ");
            String enteredPassword = scanner.nextLine();

            if (enteredEmail.equals(email) && enteredPassword.equals(password)) {
                isLoggedIn = true;
                System.out.println("Welcome , " + name + "!");
            } else {
                System.out.println("Invalid email or password. Please try again.");
            }
        }

        while (!isDoneShopping) {
            System.out.println("Please select an item to purchase:");
            System.out.println("1. Food Accessories - " + item1Price + " Taka" + " (quantity: " + item1Quantity + ")");
            System.out.println("2. Home Accessories - " + item2Price + " Taka" + " (quantity: " + item2Quantity + ")");
            System.out.println("3. Books - " + item3Price + " Taka" + " (quantity: " + item3Quantity + ")");
            System.out.println("4. Electric Parts - " + item4Price + " Taka" + " (quantity: " + item4Quantity + ")");
            System.out.println("5. Cloth - " + item5Price + " Taka" + " (quantity: " + item5Quantity + ")");

            int selectedItem = scanner.nextInt();

            System.out.println("Please enter the quantity of item " + selectedItem + " you would like to purchase:");
            int quantity = scanner.nextInt();

            int totalPrice = 0;

            switch (selectedItem) {
                case 1:
                    if (quantity > item1Quantity) {
                        System.out.println("We have limited quantity for Item 1.");
                        continue;
                    }
                    item1Quantity -= quantity;
                    totalPrice = item1Price * quantity;
                    break;
                case 2:
                    if (quantity > item2Quantity) {
                        System.out.println("We have limited quantity for Item 2.");
                        continue;
                    }
                    item2Quantity -= quantity;
                    totalPrice = item2Price * quantity;
                    break;
                case 3:
                    if (quantity > item3Quantity) {
                        System.out.println("We have limited quantity for Item 3.");
                        continue;
                    }
                    item3Quantity -= quantity;
                    totalPrice = item3Price * quantity;
                    break;


                case 4:
                    if(quantity > item4Quantity) {
                        System.out.println("We have limited quantity for Item 4.");
                        continue;
                    }
                    item4Quantity -= quantity;
                    totalPrice = item4Price * quantity;
                    break;
                case 5:
                    if(quantity > item5Quantity) {
                        System.out.println("We have limited quantity for Item 5.");
                        continue;
                    }
                    item5Quantity -= quantity;
                    totalPrice = item5Price * quantity;
                    break;

                default:
                    System.out.println("Invalid selection.");
                    continue;
            }

            System.out.println("You have selected " + quantity + " of item " + selectedItem + ".");
            System.out.println("The total price is " + totalPrice + " Taka.");

            // Add to total purchase price
            totalPurchase += totalPrice;


            if(totalPurchase > 20000) {
                double discount = totalPurchase * 0.1;
                double discountedTotal = totalPurchase - discount;
                System.out.println("Congratulations! You qualify for a 10% discount.");
                System.out.println("So your total purchase amount is " + totalPurchase + " Taka" + ", and after discounted your total amount is " + discountedTotal + " Taka");
            }
            else {
                System.out.println("So your total purchase is " + totalPurchase + " Taka");
            }


            // Payment system
            System.out.println("Please select a payment method:");
            System.out.println("1. BKash");
            System.out.println("2. Nagad");
            System.out.println("3. Banking");

            int paymentMethod = scanner.nextInt();

            switch(paymentMethod) {
                case 1:
                    System.out.println("Please make payment to bKash account 01234567890.");
                    break;
                case 2:
                    System.out.println("Please make payment to Nogot account 01234567890.");
                    break;
                case 3:
                    System.out.println("Please make payment to our bank account No - 012345678911011.");
                    break;
                default:
                    System.out.println("Invalid selection.");
                    continue;
            }

            // Ask if customer wants to make another purchase
            System.out.println("Would you like to make another purchase? (y/n)");
            String response = scanner.next();

            if(response.equalsIgnoreCase("n")) {
                isDoneShopping = true;
            }
        }

        // Check if customer qualifies for discount


        System.out.println("Thank you for shopping with us!");
    }
}
