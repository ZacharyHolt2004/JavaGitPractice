public class SportCar extends Vehicle{
    int weight;
    int topSpeed;

    public SportCar(int weight, int speed){
        this.weight = weight;
        topSpeed = speed;
    }

    //Overwritten abstract method.
    public void driveTheTrack(){
        System.out.println("SportCar is " + this.weight + " pounds\n" +
                "and has a top speed of " + this.topSpeed + "." +
                "\nIt completed the course in 2 minutes!");
    }
}
