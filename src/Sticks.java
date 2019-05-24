import java.util.Scanner;

public class Sticks {
    public static void displaysticks(){
        int sticks = 21;
        int grabSticks = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("There are " + sticks + " sticks");
        System.out.println("Choose to take 1 or 2 sticks out of the pile");
        grabSticks = input.nextInt();
        if( grabSticks >= 2){
            System.out.println(sticks - 2);
        }
        else if(grabSticks <= 1){
            System.out.println(sticks - 1);
        }





    }
}
