public class Car extends Vehicle {
    static String carType;
    static String transmission;
    String carBrend;
    Double engineSize;


    public  void setCarBrend(String value){

        System.out.println( "You car brand is: " + value);
        carBrend = value;
        switch (carBrend)  {
            case "Chevrolet Impala 1967":
                carType= "sedan";
                engineSize = 5.4;
                transmission = "manual";
              break;
            case "Land Rover Discovery Sport" :
                carType= "SUV";
                engineSize = 7.2;
                transmission = "automate";
                break;
        }
        System.out.println("engineSize:" + engineSize);
        System.out.println("Transmission:" + transmission);
    }

    public String getCarType() {

         return carType;
    }


}
