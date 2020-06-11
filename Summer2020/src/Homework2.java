/*
Write an interactive program where a “customer” is able to purchase an "imaginary" item. You need to be mindful on how
your display looks and be able to handle user input accordingly. Here are the steps your program should follow:
Step 1:	Display to the user some details about your item. You need to convey the following info:
The name of your item (any name is fine)
Your item's price
A maximum quantity

Step 2: Prompt the user to enter in the amount they want (see next page for more on how to do this).
Once entered, be sure to check: If the amount exceeds your max quantity, and if so, SET the 'amount' to be your max quantity
See Figure 2 for reference
If the amount is negative, and if so, SET the 'amount' to zero.
See Figure 3 for reference

Step 3: Calculate and display the total cost.

Extra Credit Bonus Opportunity (+3 points)
In-between steps 1 and 2, prompt the user a "yes or no" question. If they enter 'yes', proceed with the program as
described in the guidelines / requirements above (as seen in Figure 4 below), otherwise if they enter 'no', your program
should stop and do nothing else (as seen in Figure 5 below).
TIP: While parsing / analyzing strings in Java is much easier to do when compared to C++, you can simply make do by
having the user only enter in a SINGLE character (IE. 'y' or 'Y') as seen in the example images below. This will make
your "if" statements / expressions much easier to implement.
In order to read a single letter from input, you'll need another "next" statement like so:   
char firstLetter = console.next().charAt(0); 
Do NOT re-type the "import" and "new" statements as once your Scanner has been set up, you don't need to re-establish
it. Once again, don't worry about the details revolving how this line of code works and simply use it to get by for
this extra credit portion of the assignment.
 */




import java.util.Scanner;


public class Homework2 {

    public static void main(String[] args) {

        double clorox = 3.50;//the following is my "imaginary" item available for purchase
        int maxQuantity = 5;//max quantity value set for clorox
        char yes,no;//character variables for yes or no question


        //The user is presented with my item information including the item and maximum quantity
        System.out.println("\nWelcome to Wal-to-Wal Mart " +
                "\n\nThe following item we have for sale is: \n\tClorox for $" +
                +clorox + "\n\t\t*Note*: Limit Quantity is " + maxQuantity);

        //Message asking user to input if they would like to buy this item
        System.out.println("\nWould you like to buy this item?" +
                            "\nEnter 'y' for YES or 'n' for NO: ");
        Scanner console = new Scanner(System.in);//Scanner to collect the user input if they would like to buy this item
        char firstLetter = console.next().charAt(0);//Reads input collected from user and stores in this variable

        if(firstLetter == 'y') {

            //Message asking the user to input the amount of the item that they would like
            System.out.print("\nHow much clorox you would like? " +
                                "\nEnter Amount: ");

            int amount = console.nextInt();//Reads input collected from user and stores in this variable

            if (amount > 5) {
                System.out.println("\n" + amount + " is an invalid amount." +
                        "\nSetting quantity to 5.");
                System.out.println("\nYour total is: \n\t$3.50 * 5 = $ " + 5 * clorox);
            } else if (amount < 0) {
                System.out.println("\n" + amount + " is an invalid amount." +
                        "\nSetting quantity to 0.");
                System.out.println("\nYour total is: \n\t$3.50 * 0 = $ " + 0 * clorox);
            } else {
                System.out.println("\nYour total is \n\t$3.50 * " + amount + " = $ " + amount * clorox);
            }
        }
         else if(firstLetter == 'n'){
                System.out.println("\nOkay, program will now end." +
                        "\nThank you for your patronage.");}
         
    }


}
