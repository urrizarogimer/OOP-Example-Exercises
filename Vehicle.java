import java.util.*;
public class Vehicle {
    private String name = "";
    private String color = "";
    public Vehicle(String a, String b){
        this.name = a;
        this.color = b;
    }
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of car/s:");
        int nCars = scan.nextInt();
        for(int i = 0; i < nCars; i++){
            System.out.print("Enter Car's Name:");
            String cName = scan.next();
            System.out.print("Enter Car's Color:");
            String cColor = scan.next();
            Vehicle car = new Vehicle(cName, cColor);
            System.out.println("---------");
            System.out.println(car);
            System.out.println(car.name);
            System.out.println(car.color);
            System.out.println("---------");
        }
        
    }
}
