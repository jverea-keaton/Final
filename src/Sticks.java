import java.util.Scanner;

public class Sticks {
    public static void displaysticks() {
        int quit = 0;
        int grabSticks = 0;
        int count = 0;
        int sticks = 21;
        int gamesPlayed = 0;
        int players = 0;
        String playAgain = "Y";
        Scanner input = new Scanner(System.in);
        int random = (int) (Math.random() *2 + 1);


        while (playAgain.equals("Y")) {
            System.out.println(playAgain);   // this lets you have the option to play again
            gamesPlayed = gamesPlayed + 1;
            while (quit != 999) {

                System.out.println("There are " + sticks + " sticks");
                System.out.println("Choose to take 1 or 2 sticks out of the pile or 999 to quit");
                grabSticks = input.nextInt();
                if (grabSticks >= 2) {
                    sticks = sticks - 2;  // This is taking 2 sticks away from the pile if the player chooses to take that many
                    System.out.println(sticks + " Left over");
                } else if (grabSticks <= 1) {
                    sticks = sticks - 1;   // this is taking away 1 stick from the pile
                    System.out.println(sticks + " Left over");
                }
                if (sticks < 1) {
                    quit = 999;
                    System.out.println("You Suck!!!!!");
                    sticks = 21;
                }

            }
            System.out.println(count);
        System.out.println("Would you like to play again? You have played " + gamesPlayed +" games.\n Enter Y to play or any other key to quit: "); // This shows at the very end to show the games played
            playAgain = input.next();
            quit = 0;
        }
    }
}


