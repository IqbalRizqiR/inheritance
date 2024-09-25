import java.util.Scanner;

/**
 * TesterInput
 */
public class TesterInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("CD / DVD?");
        String pilihan = in.nextLine();



        System.out.println("Name : ");
        String name = in.nextLine();
        System.out.println("Number : ");
        int number = in.nextInt();
        System.out.println("Quantity : ");
        int quantity = in.nextInt();
        System.out.println("Price : ");
        double price = in.nextDouble();
        if (pilihan.equalsIgnoreCase("CD")) {
            System.out.println("Artist : ");
            String artist = in.nextLine();
            System.out.println("Label : ");
            String label = in.nextLine();
            System.out.println("Number of songs : ");
            int numSong = in.nextInt();
            CD cd = new CD(name, number, quantity, price, artist, label, numSong);
            cd.print();
        } else if (pilihan.equalsIgnoreCase("DVD")) {
            System.out.println("Length : ");
            int length = in.nextInt();
            System.out.println("Rating : ");
            String rating = in.nextLine();
            System.out.println("Studio : ");
            String studio = in.nextLine();
            DVD dvd = new DVD(name, number, quantity, price, length, rating, studio);
            dvd.print();
        }
    }
}