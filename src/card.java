public class Card {
    private String type;
    private String color;
    private final boolean isJoker;

    public Card(boolean tof){
        isJoker = true;

        if(tof){
            type = "+4";
        } else {
            type = "coringa";
        }

    }

    public Card(int n, int m){
        isJoker = false;
        setCardValue(n);
        setCardColor(m);
    }

    public void setCardValue(int n){
        switch (n) {
            case 10 -> type = "bloqueio";
            case 11 -> type = "+2";
            case 12 -> type = "volta";
            case 13 -> type = "coringa";
            default -> type = "" + n;
        }
    }

    public void setCardColor(int n){
        switch (n) {
            case 0, 4 -> color = "Amarelo";
            case 1, 5 -> color = "Verde";
            case 2, 6 -> color = "Azul";
            case 3, 7 -> color = "Vermelho";
        }
    }
    public boolean getIsJoker(){
        return isJoker;
    }

    public String getType(){
        return type;
    }

    public String getColor(){
        return color;
    }
}
