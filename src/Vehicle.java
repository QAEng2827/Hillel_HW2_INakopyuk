public class Vehicle {
    int speed = 2;
    private String model = "Some model";

    public void speedUp(int value) {

        System.out.println("You speed was increased to " + value);
    }

    public void applyBrake(int value) {

        System.out.println(" Warning! After " + value + " minuts will be use Break. Please, speed down!");

    }

    public void setModel(String model) {
        System.out.println("Wow! The model of you vehicle is: " + model);
        ;


    }

    public String getModel() {
        return model;
    }

    public void move(){
        System.out.println("Hi! It is move method from Vehicle");

    }



    final void stop() {

        System.out.println("Stop it!");
    }


}
