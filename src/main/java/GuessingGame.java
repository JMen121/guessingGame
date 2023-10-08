
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        //Ask the user for their name//
        System.out.println("What is your name?");
        //Use Scanner class in order to achieve this//
        Scanner sc = new Scanner(System.in); //Scanner object has been Added//
        String username = sc.nextLine(); //This has stringed the username and asked the machine to read the line the user writes

        //Welcome the user//
        System.out.println("Hello " + username);

        //Asks What number am I thinking of between 1 -30?//
        System.out.println("Am I thinking of a number between 1-30, What number am I thinking of?");

        //User inserts the number//
        int userAnswer = Integer.parseInt(sc.nextLine());
        int gameAnswer = 22;


        //Machine should input congratulations if achieved//
        if (userAnswer == 22) ;
        {
            System.out.println("Wohoo! You're a whizz at this!");

            //Machine should output whether it is high or low//
        } else if (userAnswer > gameAnswer) {
            System.out.println("Woah Tiger, that's a higher than my number!");
        } else if (userAnswer < gameAnswer) {
            System.out.println("My number is higher than that!");
        }
    }
}


//if useranswer is less 21,20 or 23,24 - almost there answer//


