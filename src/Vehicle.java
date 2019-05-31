public abstract class Vehicle {
    int speed;
    private String model;

    public  void speedUp(int value)
    {

        speed=speed+value;

        System.out.println("You speed "  + speed + "was increased to " + value);
    }

    public  void applyBrake(int value)
    {

        speed = speed - value;

        if (speed > 0) {

            System.out.println("Speed decreased for " + value + " Current speed is " + speed + " km/h");
        } else {
            System.out.println("Vehicle was stopped");

        }

    }

    public void setModel(String model)
    {
       this.model=model;
    }

    public   String getModel()
    {
        return model;
    }

    public abstract int move();
//    {
//        System.out.println("Hi! It is move method from Vehicle class");
//        return  speed;
//
//    }



    final  void stop() {
        applyBrake(speed);
        System.out.println("Stop it!");
    }


}
