public class ProductGet {
    public static void main(String[] args) {
        CD cd = new CD();
        cd.setLabel("ABC");
        cd.setArtist("Lady Gaga");
        cd.setNumSong(2);
        
        DVD dvd = new DVD();
        dvd.setStudio("Universal");
        dvd.setRating("PG");
        dvd.setLength(120);
        
        cd.print();
        dvd.print();

    }
}
