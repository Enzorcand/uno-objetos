import java.util.Random;
public class Deck {
    private Card[] cards;
    final int size;

    public Deck(int size){
        this.size = size;
        setCards();
        shuffle();
    }

    public void setCards(){
        int j = 0;
        int k = 0;
        for(int i = 0; i < 108*size; i++){
            for(int n = 0; n < 108; n++){

                //verifica quando as cartas vão voltar ao valor inicial
                if(k < 4) {
                    if (j < 13) {
                        j = 0;
                    }
                }
                if(j < 13){
                    j = 1;
                }

                //verifica se a carta é um coringa e instancia a carta no baralho na sua posição correta.
                if(j == 13){
                    if (k < 4){
                        cards[i] = new Joker(j, true);
                    } else {
                        cards[i] = new Joker(j, false);
                    }
                }else{
                    cards[i] = new Color(j, k);
                }

                j++;
                k++;
            }
        }
    }

    public void shuffle(){

    }
}
