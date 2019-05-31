import java.util.Objects;

public class Helicopter extends Vehicle {


    int amountOfPasangers;
    int maxHeight;
    int tankSize;

    private String name;

    public String getName(){return name;}

    public Helicopter(int amountOfPasangers, int maxHeight) {
        this.name = name;
    }

    public Helicopter(int amountOfPasangers, int maxHeight, int tankSize) {
        this.amountOfPasangers = amountOfPasangers;
        this.maxHeight = maxHeight;
        this.tankSize = tankSize;
    }

    public int move(){

        System.out.println("It is move method from class Helicopter");
        return speed;
    }

    @Override
    public String toString() {
        return "name=" + name+"#"+ Integer.toHexString(hashCode());
    }



    
@Override
    public boolean equals(Object o) {
//        if(o == null)
//        {
//            return false;
//        }
//        if (o == this)
//        {
//            return true;
//        }
//        if (getClass() != o.getClass())
//        {
//            return false;
//        }
//        Helicopter e = (Helicopter) o;
//        return (this.getName() == e.getName());

    if (this == o) return true;
    if (!(o instanceof Helicopter)) return false;
    Helicopter that = (Helicopter) o;

    return amountOfPasangers == that.amountOfPasangers &&
            maxHeight == that.maxHeight &&
            tankSize == that.tankSize;
    }

 @Override
    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
//        //result = prime * result + id; result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
//     return result;
     return Objects.hash(amountOfPasangers, maxHeight, tankSize);
    }

}
