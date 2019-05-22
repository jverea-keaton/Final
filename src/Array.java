public class Array {

    public static void displayArray(){
        double[] cards = {52};
        int total = 0;

        displayFor(cards);

    }
    public static void displayFor(double[] cards){
        for(int i = 0; i <cards.length; i++){
            System.out.println(cards[i]);
        }
        for(int j = cards.length-1; j>=0; j--){
            System.out.println(cards[j]);
        }
    }
}
