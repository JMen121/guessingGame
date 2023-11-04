
/*import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        //Ask the user for their name//
        System.out.println("What is your name?");
        //Use Scanner class in order to achieve this//
        Scanner sc = new Scanner(System.in); //Scanner object has been Added//
        String username = sc.nextLine();
        //This has stringed the username and asked the machine to read the line the user writes

        //Welcome the user//
        System.out.println("Hello " + username);

        //Asks What number am I thinking of between 1 -30?//
        System.out.println("I am thinking of a number between 1-30, What number am I thinking of?");

        //User inserts the number//
        int userAnswer = Integer.parseInt(sc.nextLine());
        int gameAnswer = 22;
        //User should have three attempts
        int maxAttempts = 2;


        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            //Machine should input congratulations if achieved//
            if (userAnswer == 22) {
                System.out.println("Wohoo! You're a whizz at this!");
                break;
                //This will make the game end as the player has won

                //if useranswer is less 21,20 or 23,24 - almost there answer//
            } else if (userAnswer >= 20 && userAnswer <= 24) {
                System.out.println("Almost there pal! You've got this! Think Smart!");
                userAnswer = Integer.parseInt(sc.nextLine());
                //Machine should output whether it is high or low//

            } else if (userAnswer >= gameAnswer) {
                System.out.println("Woah Tiger, that's a higher than my number!");
                System.out.println("Try again");
                userAnswer = Integer.parseInt(sc.nextLine());

            } else if (userAnswer <= gameAnswer){
                System.out.println("My number is lower than that!");
                System.out.println("Try again");
                userAnswer= Integer.parseInt(sc.nextLine());
            }
          }
        if(userAnswer == maxAttempts){
            System.out.println("Oh No, seems like you've exhausted all your tries! Better luck next time!");
        }

    }


}*/

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Ask the user for their name
        System.out.println("What is your name?");

        // Use Scanner class to get user input
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        // Welcome the user
        System.out.println("Hello " + username);

        // Ask the user to guess the number between 1-30
        System.out.println("Am I thinking of a number between 1-30? What number am I thinking of?");

        // User inserts the number
        int userAnswer = Integer.parseInt(sc.nextLine());
        int gameAnswer = 22;

        // User has three attempts
        int maxAttempts = 3;

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            if (userAnswer == gameAnswer) {
                // Machine should input congratulations if the user has guessed correctly
                System.out.println("Wohoo! You're a whizz at this!");
                break; // End the game
            } else if (userAnswer >= gameAnswer - 2 && userAnswer <= gameAnswer + 2) {
                // If user is close to the correct answer
                System.out.println("Almost there pal! You've got this! Think Smart!");
            } else if (userAnswer > gameAnswer) {
                // If user's guess is higher than the correct answer
                System.out.println("Woah Tiger, that's higher than my number!");
            } else {
                // If user's guess is lower than the correct answer
                System.out.println("My number is higher than that!");
            }

            // Prompt the user to try again
            System.out.println("Try again");
            userAnswer = Integer.parseInt(sc.nextLine());
        }

        // Check if the user has exhausted all attempts
        if (userAnswer != gameAnswer) {
            System.out.println("Oh No, seems like you've exhausted all your tries! Better luck next time!");
        }
    }
}



