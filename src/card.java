public abstract class Card {
    protected String[] type;


    public Card(){
        this.type = new String[2];
    }

    public String getType(){
        return type[0];
    }

    public String getColor(){
        return type[1];
    }
}
