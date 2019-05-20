public class RoadBicycle extends Bicycle  {
    private int rudderDepth = 6;

    public void setRudderDepth(int value){
        System.out.println("Rudder Depth is " + value);
        rudderDepth = value;

    }

    public int getRudderDepth() {
        return rudderDepth;
    }
}
