
import java.util.Scanner;

public class ProductGet {
    public static void main(String[] args) {
        int option, objectQuantity, quantity, price, numSong, length;
        String productName, rating, studio, artist, label;
        Scanner input = new Scanner(System.in);

        System.out.println("How much product that u want to make : ");
        objectQuantity = input.nextInt();

        if (objectQuantity > 10 || objectQuantity < 1) {
            System.out.println("You can't make more than 10 products");
        } else if(objectQuantity == 1){
            Product product = new Product();
            try {
                System.out.println("Select an option: ");
                System.out.println("1. DVD\n2. CD");

                option = input.nextInt();

                if (option == 1) {
                    DVD dvd = new DVD();
                    dvd.print();
                } else if(option == 2){
                    CD cd = new CD();
                    cd.print();
                } else {
                    System.out.println("Invalid option");
                }
            } catch (Exception e) {
                System.out.println("Error : input yang dimasukkan bukan angka");
            }
        } else {
            for (int i = 1; i <= objectQuantity; i++) {
                Product product = new Product();
                try {
                    System.out.println("Select an option: ");
                    System.out.println("1. DVD\n2. CD");
    
                    option = input.nextInt();
    
                    if (option == 1) {
                        DVD dvd = new DVD();
                        dvd.print();
                    } else if(option == 2){
                        CD cd = new CD();
                        cd.print();
                    } else {
                        System.out.println("Invalid option");
                    }
                } catch (Exception e) {
                    System.out.println("Error : input yang dimasukkan bukan angka");
                }
            }
        }

        

        


    }
}
