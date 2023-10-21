import java.util.ArrayList;
public class Hand {
    ArrayList<Card> pHand;
    public Hand(Deck deck){
        setHand(deck);
    }

    //Metodo que gera a mão inicial de cada jogador
    public void setHand(Deck deck){
        for(int i = 0; i < 7; i++){
            Card card = deck.buyCard();
            pHand.add(card);
        }
    }
}
