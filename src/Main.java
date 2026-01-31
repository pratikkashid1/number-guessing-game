import java.util.Scanner;

public class Main {

    public static void NumberGuessing() {

        Scanner sc = new Scanner(System.in);

        // to get random number from 1 to 100
        int number = 1 + (int)(100 * Math.random());

        // chances to guess number
        int k = 5;

        // Input from user
        System.out.println("<-------------------------------------->");
        System.out.println("Choose Number between 1 to 100");
        System.out.println("You have "+k+" attempts to guess number !!");


        for(int i = 0; i < k; i++) {
            System.out.println("<-------------------------------------->");
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            if(guess == number) {
                System.out.println("<-------------------------------------->");
                System.out.println("Congratulations !! you guessed the correct number "+number+".");
                sc.close();

                return;
            }

            else if(guess > number) {
                System.out.println("the number is less than: "+guess);
            }

            else {
                System.out.println("the number is greater than: "+guess);
            }
        }

        System.out.println("<-------------------------------------->");
        System.out.println("You have exhausted all attempts. the number is: "+number);
        sc.close();
    }

    static void main() {
        NumberGuessing();
    }
}