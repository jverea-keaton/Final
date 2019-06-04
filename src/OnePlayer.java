import java.util.Scanner;

public class OnePlayer {

    public static void displaysOnePlayer() {
        int quit = 0;
        int grabSticks = 0;
        int count = 0;
        int sticks = 21;
        int gamesPlayed = 0;
        int turns = 0;
        String playAgain = "Y";
        Scanner input = new Scanner(System.in);
        int random = (int) (Math.random() * 2 + 1);
        System.out.println("One Player Game");



        while (playAgain.equals("Y")) {
            System.out.println(playAgain);
            gamesPlayed = gamesPlayed + 1;
            while (quit != 999) {

                System.out.println("There are " + sticks + " sticks");
                System.out.println("Choose to take 1 or 2 sticks out of the pile or 999 to quit");

                grabSticks = input.nextInt();
                if (turns % 2 == 0) {//users turn
                    if (grabSticks >= 2) {
                        sticks = sticks - 2;
                        System.out.println(sticks + " Left over");
                    } else if (grabSticks <= 1) {
                        sticks = sticks - 1;
                        System.out.println(sticks + " Left over");
                    } else if (sticks <= 1) {
                        System.out.println("You lose");
                    }

                } else//computers turn
                    if (random >= 2) {
                        sticks = sticks - 2;
                        System.out.println(sticks + " Left over");
                    } else if (random <= 1) {
                        sticks = sticks - 1;
                        System.out.println(sticks + " Left over");
                    }
                    turns++;
                if (sticks < 1) {
                    quit = 999;
                    System.out.println("You lose");
                    sticks = 21;
                }
            }
            System.out.println(turns);
            System.out.println("Would you like to play again? You have played " + gamesPlayed + " games.\n Enter Y to play or any other key to quit: ");
            playAgain = input.next();
        }
    }
}




