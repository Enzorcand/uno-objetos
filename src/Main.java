public class Main {
    public static void main(String[] args) {
        Deck baralho = new Deck(1);
        for (Card card : baralho.getCards()){
            if(card instanceof Joker){
                System.out.println(card.getType());
            } else {
                System.out.print(card.getType() + " ");
                System.out.println(card.getColor());
            }
        }
    }
}