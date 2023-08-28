public class Main {
    public static void main(String[] args) {
        Deck baralho = new Deck(1);
        for (int i = 0; i < baralho.getCards().length; i++){
            if(baralho.getCard(i).getIsJoker()){
                System.out.println(baralho.getCard(i).getType());
            } else {
                System.out.print(baralho.getCard(i).getColor() + " ");
                System.out.println(baralho.getCard(i).getType());
            }
        }

    }
}