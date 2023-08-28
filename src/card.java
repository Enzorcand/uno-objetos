public class Card {
    private int type;
    private final boolean isJoker;

    public Card(int n){
        isJoker = 13 == n;
        type = n;
        setCardValue();
    }

    public void setCardValue(){

    }
    public boolean getIsJoker(){
        return isJoker;
    }
}
