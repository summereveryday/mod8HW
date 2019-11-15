package sample;

import java.util.Random;

public class Card {
    String url;
    int card;

    public int getNum(int card1, int card2){
        Random random = new Random();
        this.card = random.nextInt(54);
        while (this.card != 0 && this.card == card1 || this.card == card2){
            this.card = random.nextInt(52);
        }
        return this.card;
    }


    public String getURL(int num){
        this.url = "card/";
        this.url += Integer.toString(num);
        this.url += ".png";
        return url;
    }

}
