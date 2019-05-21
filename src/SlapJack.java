
import java.util.Scanner;


public class SlapJack {

    public static void main(String[] args) {
        int cards;
        int jack;
        int deal;
        int slap;
        int user;
        displayfourloop();
        Scanner input = new Scanner(System.in);

        Rules.displayRulesFirstPart();
        int random = (int) (Math.random() * 3 + 1);





    }
    public static void displayfourloop(){
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
}

