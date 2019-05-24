public class Helicopter extends Vehicle {
  //  final int hellId = 666;
    int amountOfPasangers;
    int maxHeight;
    int tankSize;
    private String name;

    public String getName(){return name;}

    public Helicopter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name=" + name;
    }

    public void move(){
        super.move();

        System.out.println("It is move method from class Helicopter");
    }
@Override
    public boolean equals(Object o) {
        if(o == null)
        {
            return false;
        }
        if (o == this)
        {
            return true;
        }
        if (getClass() != o.getClass())
        {
            return false;
        }
        Helicopter e = (Helicopter) o;
        return (this.getName() == e.getName());
    }

 @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        //result = prime * result + id; result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
     return result;
    }

}
