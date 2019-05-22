import jdk.nashorn.api.tree.NewTree;

import java.util.Random;

public class CardValues {


    public static void displayArray() {
        int[] red_cards = {1,2,3,4,5,6,7,8,9,10,14, 12, 13};//1 is ace 11 jack 12 = queem and 13 = king
        int[] black_cards = {1,2,3,4,5,6,7,8,9,10,14, 12, 13};//1 is ace 11 jack 12 = queem and 13 = king
        int total = 0;

        displayFor(red_cards, black_cards);

    }

    public static void displayFor(int[] red_cards, int[] black_cards) {

        Random rand = new Random();

        int r = (int) (Math.random() * red_cards.length);
        int b = (int) (Math.random() * black_cards.length);
        int flipCoin = (int) (Math.random() * 4+ 1);

        if(flipCoin == 1){
            System.out.println("Red Diamond " + r );}
        if(flipCoin == 2){
            System.out.println("Black Spade " + b );}
        if(flipCoin == 3){
            System.out.println("Red Heart " + r );}
        if(flipCoin == 4){
            System.out.println("Black Club " + b );}




    }

}