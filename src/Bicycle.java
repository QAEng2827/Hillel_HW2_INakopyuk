public class Bicycle extends Vehicle {

    public static final int id = 2827;
    protected  int gear=4;


    public Bicycle(){


     System.out.println("in the constructor of class Bicycle: ");
     System.out.println("id = "+ id);

     System.out.println("gear = "+gear);
     gear = 3;

    }
    public Bicycle(int id,int gear){
       super();
     System.out.println("in the method of class Bicycle: ");
     System.out.println("id= " + id);
     id = id+10000;
     System.out.println("gear= " + gear);

    }


    public void changeGear(int value){
     System.out.println("The gear was " + value);
     value = 1 + gear;
     System.out.println("The gear is  " + value + " now ");

    }

@Override
    public void move(){
  //      super.move();

    System.out.println("It is move method from class Bicycle");

    }
}
