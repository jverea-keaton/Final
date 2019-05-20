
public class SlapJack {

    public static void main(String[] args) {
        int cards;
        int jack;
        int deal;
        int slap;
        displayfourloop();

        System.out.println("This is a game called slap jack. ");
    }

    public static void displayfourloop() {
        while (user != 999)
        {
            if (user == 1) {
                if (random == 1)
                    result = "tie";
                else if (random == 2)
                    result = "Lose";
                else
                    result = "Win";
            } else if (user == 2) {
                if (random == 1) {
                    result = "Win";
                }
            }
        }
    }
}