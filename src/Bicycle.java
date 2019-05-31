public class Bicycle extends Vehicle {

    public final int id;
    protected int gear;


    public Bicycle(int id, int gear) {
        this.id = id;
        this.gear = gear;
    }

    public Bicycle(int id, String bicycleName) {
        this.id = id;
        super.speed = 45;
        super.setModel(bicycleName);
        System.out.println("Road Bicycle with id - " + id + " called " + bicycleName +
                ", can move with a speed more than " + speed + " km/h");

    }


    public Bicycle(int id) {
        this.id = id;
    }

    public void changeGear(int value) {

        this.gear = value;
        System.out.println("The gear is  " + value);
    }

    @Override
    public int move() {
        System.out.println("It is move method from class Bicycle");
        return speed;

    }

    public int getId() {
        return id;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
