public class Truck extends Vehicle {
    int weight;
    int topSpeed;

    public Truck(int weight, int speed){
        this.weight = weight;
        topSpeed = speed;
    }

    public void driveTheTrack(){
        System.out.println("Truck is " + this.weight + " pounds\n" +
                "and has a top speed of " + this.topSpeed + "." +
                "\nIt completed the course in 6 minutes!");
    }
}
