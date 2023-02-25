public class Pirates {
   private int health = 0;
   private int power = 0;
   private String name = "";
   
   public Pirates(String n, int a, int b){
    this.name = n;
    this.health = a;
    this.power = b;
   }

   public void attack(int pow){
        this.health -= pow;
   }

   public void displayInfo(){
      System.out.println(this.name);
      System.out.println("Health:" + this.health);
      System.out.println("Power:" + this.power);
      System.out.println("--------------------");
   }

   public static void main (String args[]){
    Pirates pirate1 = new Pirates("Monkey D. Luffy", 100, 10);
    Pirates pirate2 = new Pirates("Rob Lucci", 100, 8);
    System.out.println(pirate1.name + " attacks " + pirate2.name);
    pirate2.attack(pirate1.power);
    pirate1.displayInfo();
    pirate2.displayInfo();
    System.out.println(pirate2.name + " attacks " + pirate1.name + " twice");
    pirate1.attack(pirate2.power);
    pirate1.attack(pirate2.power);
    pirate1.displayInfo();
    pirate2.displayInfo();


    







    
   }
}
