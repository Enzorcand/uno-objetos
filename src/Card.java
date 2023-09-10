public abstract class Card {
    protected Type type;

    public Card(){
        this.type = new Type();
    }

    public String getType(){
        return type.getType();
    }

    public String getColor(){
        return type.getColor();
    }
}
