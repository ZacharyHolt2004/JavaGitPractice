import java.util.Scanner;
public class Demo {
    public static void main(String[] args){
        Vehicle polymorphicVar;
        String choice = "empty";
        System.out.println("Pick a number one or two");
        Scanner inputScanner = new Scanner(System.in);
        boolean hasInput = false;
        while(!hasInput){
            choice = inputScanner.next();
            if(choice.equals("1") || choice.equals("2")){
                hasInput = true;
            }
            else{
                System.out.println("Please choose 1 or 2");
            }
        }
        if(choice.equals("1")){
            polymorphicVar = new SportCar(2500, 140);
            polymorphicVar.driveTheTrack();
        }
        if(choice.equals("2")){
            polymorphicVar = new Truck(4000, 85);
            polymorphicVar.driveTheTrack();
        }


    }
}
