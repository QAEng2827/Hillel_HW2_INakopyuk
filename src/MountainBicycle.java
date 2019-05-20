public class MountainBicycle extends Bicycle {
    private int seatHeight = 10;

    public  void setSeatHeight(int value){

        System.out.println( "You seat height is: " + value);
        seatHeight = value;
    }

    public int getSeatHeight() {
        return seatHeight;
    }
}
