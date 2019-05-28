import java.util.Scanner;

public class Sticks {
    public static void displaysticks(){
        int quit = 0;
        int grabSticks = 0;

        int sticks = 21;
        Scanner input = new Scanner(System.in);

        while(quit != 999) {

            System.out.println("There are " + sticks + " sticks");
            System.out.println("Choose to take 1 or 2 sticks out of the pile or 999 to quit");
            grabSticks = input.nextInt();
            if (grabSticks >= 2) {
                sticks = sticks -2;
                System.out.println(sticks);
            } else if (grabSticks <= 1) {
                sticks = sticks -1;
                System.out.println(sticks);
            }
            if(sticks < 1){
                quit = 999;
                System.out.println("You Suck!!!!!");
            }
        }



    }
}
