import java.util.*;
public class Rectangle {
    private int length = 0;
    private int width = 0;

    public Rectangle(int a, int b){
        this.length = a;
        this.width = b;
    }

    public int displayArea(){

        return this.length * this.width;
    }

    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Creating a rectangle");
        System.out.print("Enter length:");
        int l = scan.nextInt();
        System.out.print("Enter width:");
        int w = scan.nextInt();
        Rectangle rec = new Rectangle(l,w);
        System.out.print("The Area is: " + rec.displayArea());
        scan.close();
    }

}

