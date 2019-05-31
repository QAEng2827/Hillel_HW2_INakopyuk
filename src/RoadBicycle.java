public class RoadBicycle extends Bicycle {
    private int rudderDepth;

    public RoadBicycle(int id, int gear, int rudderDepth) {
        super(id);
        this.rudderDepth = rudderDepth;
        this.gear = gear;
        System.out.println("Road Bicycle  ID:" + id + " has " + gear + " gears" + " and  rudder depth: " + rudderDepth);
    }

    public void setRudderDepth(int value) {
        this.rudderDepth = value;
    }

    public int getRudderDepth() {
        return rudderDepth;
    }
}
