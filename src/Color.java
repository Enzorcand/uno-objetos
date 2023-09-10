public class Color extends Card {

    public Color(int j, int k){
        super();
        setCardValue(j);
        setCardColor(k);
    }


    public void setCardValue(int n){
        switch (n) {
            case 10 -> type.setType("bloqueio");
            case 11 -> type.setType("+2");
            case 12 -> type.setType("retorno");
            default -> type.setType("" + n);
        }
    }

    //Metodo que define a cor
    public void setCardColor(int n) {
        switch (n) {
            case 0, 4 -> type.setColor("Amarelo");
            case 1, 5 -> type.setColor("Azul");
            case 2, 6 -> type.setColor("Vermelho");
            case 3, 7 -> type.setColor("Verde");
        }
    }
}
