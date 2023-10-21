import java.util.Random;
public class Deck {
    private Card[] cards;
    final int size;
    private int nullCards;

    public Deck(int size){
        this.size = size;
        cards = new Card[108*size];
        resetCards();
        shuffle();
        nullCards = 0;
    }

    //Metodo que reseta o baralho.
    public void resetCards() {
        int j = 0;
        int k = 0;
        for (int n = 0; n < 108; n++) {
            if( k > 7) k = 0;
            // verifica quando as cartas vão voltar ao valor inicial
            if (k >= 3) {
                if (j > 13) {
                    j = 1;
                    k++;
                }
            }
            if (k < 3) {
                if (j > 13) {
                    j = 0;
                    k++;
                }
            }

            //verifica se a carta é um coringa e instancia a carta no baralho na sua posição correta.
            if (j == 13) {
                if (k < 4) {
                    cards[n] = new Joker(true);
                } else {
                    cards[n] = new Joker(false);
                }
            } else {
                cards[n] = new Color(j, k);
            }
            j++;
        }
    }

    public void shuffle(){

    }

    public Card buyCard(){
        if(nullCards == cards.length){
            resetCards();
            shuffle();
        }
        int i = -1;
        Card card;
        do{
            i++;
            card = cards[i];
        }while(card == null);
        cards[i] = null;
        return card;
    }

    public Card[] getCards(){
        return cards;
    }

    public Card getCard(int n){
        return cards[n];
    }
}
