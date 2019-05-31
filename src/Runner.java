import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Runner {
    public static void main (String Arg[]){

/*
Task2: Use every variable and method for objects of MountainBicycle and RoadBicycle (Remember that all non-private variables
from parent class are available). Do that in main() in Runner class. Set some values for variables,
use methods if variables are private.
 */
        System.out.println("Mountain Bicycle");
        MountainBicycle bicM = new MountainBicycle(7,22);
        bicM.setSeatHeight(10);
        bicM.changeGear(8);

        System.out.println();
        System.out.println();
        System.out.println("Road Bicycle");

        RoadBicycle bicR= new RoadBicycle(8,12, 15);
        bicR.setRudderDepth(17);
        System.out.println("Now rudder depth is: "+ bicR.getRudderDepth());
        bicR.changeGear(27);


        bicM.stop();
        bicR.stop();
/*
    [ 3 ] Overloading and overriding.
    Override move() in Bicycle and add new behavior (other then in Vehicle).
    Overload constructor in Bicycle.
    */
        System.out.println();
        System.out.println();


       bicR.move();
        System.out.println();
       bicM.move();
        System.out.println();
       // Bicycle bic = new Bicycle(11, "Giant");

// обращение к методам и переменным  класса Bicycle
//
//        System.out.println("Class Bicycle " + bicM.gear);
//        System.out.println("Class Bicycle " + bicR.gear);
//        bicM.changeGear(10);
//
//
//        System.out.println("Seat Height is:" + bicM.getSeatHeight());
//        System.out.println("Rudder Depth is:" + bicR.getRudderDepth());
//        System.out.println();
//        bicM.setSeatHeight(5);
//        bicR.setRudderDepth(20);
//        System.out.println();
//        System.out.println("New Seat Height is:" + bicM.getSeatHeight());
//        System.out.println(" New Rudder Depth is:" + bicR.getRudderDepth());
//        System.out.println();


    /*(
     [ 4 ] Override hashCode() and equals() in Helicopter.
     Create few objects of Helicopter and compare them using ‘==’ and equals().
     Create few objects of RoadBicycle and compare them using ‘==’ and equals(). Find the difference
    */
        System.out.println("HELICOPTERS");


        Helicopter helly1 = new Helicopter(8,1000, 20);
        Helicopter helly2 = new Helicopter(8,1000, 20);
        Helicopter helly3 = new Helicopter(4, 1500);
//        System.out.println("helly1 hashCode is " + helly1.toString());
//        System.out.println("helly2 hashCode is " + helly2.toString());
//        System.out.println("helly3 hashCode is " + helly3.toString() + "\n");

        System.out.println(helly1.toString());
        System.out.println(helly2.toString());
        System.out.println(helly3.toString());
        System.out.println();

        System.out.println("Compare Helicopter objects with == ");
        System.out.println(helly1 == helly2);
        System.out.println(helly2 == helly3);

        System.out.println( "\n" + "Compare Helicopter objects with method equals()");
        System.out.println(helly1.equals(helly2));
        System.out.println(helly2.equals(helly3));


        System.out.println("----------------------------\n");

        System.out.println("ROADBICYCLE");

        RoadBicycle bicR1= new RoadBicycle(13,8, 15);
        RoadBicycle bicR2= new RoadBicycle(27,12, 15);
        RoadBicycle bicR3= new RoadBicycle(27,12, 15);
        System.out.println(bicR1.toString());
        System.out.println(bicR2.toString());
        System.out.println(bicR3.toString());
        System.out.println();

        System.out.println("Compare RoadBicycle objects with == ");
        System.out.println(bicR1 == bicR2);
        System.out.println(bicR2 == bicR3);

        System.out.println( "\n" + "Compare RoadBicycle objects with method equals()");
        System.out.println(bicR1.equals(bicR2));
        System.out.println(bicR2.equals(bicR3));


//Task 5. Set some values to variables of Car. Print them out in console.
        System.out.println("----------------------------\n");

//        System.out.println("CARS");
//        Car car1= new Car();
//        Car car2= new Car();
//
//        car1.setCarBrend("Chevrolet Impala 1967");
//        System.out.println("CarType is: " +car1.getCarType());
//        car1.setTransmission("four");
//
//
//        car2.setCarBrend("Land Rover Discovery Sport");
//        System.out.println("CarType is: " +car2.getCarType());
//        car2.setTransmission("six");



   }
}
