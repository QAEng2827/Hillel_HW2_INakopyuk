import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Runner {

/*
Task2: Use every variable and method for objects of MountainBicycle and RoadBicycle (Remember that all non-private variables
from parent class are available). Do that in main() in Runner class. Set some values for variables,
use methods if variables are private.
 */

    public static void main (String Arg[]){

       // Vehicle.move(); // если метод move сделать static
        Vehicle vehicle=new Vehicle();
        RoadBicycle bicR= new RoadBicycle();

        MountainBicycle bicM = new MountainBicycle();



        // обращение к методам и переменным  класса Vеhicle
        System.out.println("Mountain Bicycle speed is: " + bicM.speed);
        System.out.println("Road Bicycle speed is: " + bicR.speed);
        System.out.println();
        System.out.println("Mountain Bicycle gear is: " + bicM.gear);
        System.out.println("Road Bicycle gear is: " + bicR.gear);
        System.out.println();


        bicM.speed = 10 ;
        bicR.speed = 30;

        if (bicM.speed <=15) {

            bicM.speedUp(bicM.speed);
        } else {
            bicM.applyBrake(bicM.speed);
        }

        System.out.println();

        if (bicR.speed <=15) {

            bicR.speedUp(bicR.speed);
        } else {
            bicR.applyBrake(bicR.speed);
        }

        System.out.println();
        System.out.println("Now speeds are: ");
        System.out.println("Mountain Bicycle is:  " + bicM.speed);
        System.out.println("Road Bicycle is:  " + bicR.speed);
        System.out.println();

        System.out.println("You have " + bicM.getModel()+ " of mountain bicycle");
        System.out.println("You have " + bicR.getModel()+ " of road bicycle");

        bicM.setModel("TREK 820");
        bicR.setModel("Ardis");
        System.out.println();

        bicM.stop();
        bicR.stop();

        System.out.println();
        System.out.println();

       vehicle.move();
       bicR.move();
        System.out.println();
       bicM.move();
        System.out.println();


// обращение к методам и переменным  класса Bicycle

        System.out.println("Class Bicycle " + bicM.gear);
        System.out.println("Class Bicycle " + bicR.gear);
        bicM.changeGear(10);


        System.out.println("Seat Height is:" + bicM.getSeatHeight());
        System.out.println("Rudder Depth is:" + bicR.getRudderDepth());
        System.out.println();
        bicM.setSeatHeight(5);
        bicR.setRudderDepth(20);
        System.out.println();
        System.out.println("New Seat Height is:" + bicM.getSeatHeight());
        System.out.println(" New Rudder Depth is:" + bicR.getRudderDepth());
        System.out.println();

        //Override hashCode() and equals() in Helicopter.
        // Create few objects of Helicopter and compare them using ‘==’ and equals().
        System.out.println("HELICOPTERS");

        Helicopter helly1 = new Helicopter("HellyOld");
        Helicopter helly2 = new Helicopter("HellyOld");
        System.out.println(helly1.toString());
        System.out.println(helly2.toString());
        System.out.println();


        System.out.println("Is Helli1 equals Helli2? " + helly2.equals(helly1));
        System.out.println();
        System.out.println();
        System.out.println();
        Set helicopters = new HashSet();
        helicopters.add(helly1);
        helicopters.add(helly2);

        System.out.println(helicopters);//  если имена одинаковые, то печатает одно

        helly2.move();
        helly1.move();




        helly1.maxHeight = 1200;
        helly1.tankSize =50;
        helly1.amountOfPasangers =8;

        helly2.maxHeight= 1200;
        helly2.tankSize= 25;
        helly2.amountOfPasangers=2;
        System.out.println();





//Task 5. Set some values to variables of Car. Print them out in console.

        System.out.println("CARS");
        Car car1= new Car();
        Car car2= new Car();

        car1.setCarBrend("Chevrolet Impala 1967");
        System.out.println("CarType is: " +car1.getCarType());


        car2.setCarBrend("Land Rover Discovery Sport");
        System.out.println("CarType is: " +car2.getCarType());



   }
}
