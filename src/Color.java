public class Color extends Card {

    public Color(int j, int k){
        super();
        setCardValue(j);
        setCardColor(k);
    }


    public void setCardValue(int n){
        switch (n) {
            case 10 -> type[0] = "bloqueio";
            case 11 -> type[0] = "+2";
            case 12 -> type[0] = "retorno";
            default -> type[0] = "" + n;
        }
    }

    public void setCardColor(int n) {
        switch (n) {
            case 0, 4 -> type[1] = "Amarelo";
            case 1, 5 -> type[1] = "Verde";
            case 2, 6 -> type[1] = "Azul";
            case 3, 7 -> type[1] = "Vermelho";
        }
    }
}
