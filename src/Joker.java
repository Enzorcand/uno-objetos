public class Joker extends Card{
    private boolean isBuyFour;
    public Joker(boolean tof){
        super();
        isBuyFour = tof;

        if(tof){
            type.setType("+4");
        }
        if(!tof){
            type.setType("coringa");
        }
        type.setColor(null);
    }
}
