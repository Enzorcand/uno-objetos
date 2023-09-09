public class Joker extends Card{
    private boolean isBuyFour;
    public Joker(boolean tof){
        super();
        isBuyFour = tof;

        if(tof){
            type[0] = "+4";
        }
        if(!tof){
            type[0] = "coringa";
        }
        type[1] = null;
    }
}
