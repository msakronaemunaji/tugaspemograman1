
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author priat
 */
public class DuckSimulator {
    public static void main(String[] args){
        
 
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Pilih jenis bebek (1 = MallardDuck, 2 = RubberDuck, 3 = DecoyDuck, 0 = Keluar): ");
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Terima kasih telah menggunakan Duck Simulator. Sampai jumpa!");
                break;
            }
            
            Duck duck = null;
            
            switch (choice) {
                case 1:
                    duck = new MallardDuck();
                    System.out.println("FlyWithWings");
                    break;
                case 2:
                    duck = new RubberDuck();
                    System.out.println("fly No Way");
                    break;
                case 3:
                    duck = new DecoyDuck();
                    System.out.println("Fly with wings");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    continue;
            }
            
            System.out.println("Anda memilih:");
           
        }
        
        scanner.close();
    

        
 
MallardDuck mallard = new MallardDuck();
FlyBehavior cantFly = () -> System.out.println("im cant fly");
QuackBehavior squeak =() -> System.out.println("Squeak");

RubberDuck rubberDuckie = new RubberDuck(cantFly,squeak);
DecoyDuck decoy = new DecoyDuck();

Duck model = new ModelDuck();
 mallard.performQuack();
rubberDuckie.performQuack();
decoy.performQuack();
model.performFly();
model.setFlyBehavior(new FlyRocketPowered());
model.performFly();






    
}
}