/**
 * CD
 */
public class CD extends Product {

    private String artist;
    private String label;
    private int numSong;

    public CD() {
        super(); // call the constructor of the parent class
        artist = "";
        label = "";
        numSong = 0;
    }
	
	public CD(String name, int number, int quantity, double price, String artist, String label, int numSong) {
		super(name, number, quantity, price);
		this.artist = artist;
		this.label = label;
		this.numSong = numSong;
	}
	public String getArtist() {
		return this.artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getNumSong() {
		return this.numSong;
	}

	public void setNumSong(int numSong) {
		this.numSong = numSong;
	}

    public void print() {
        super.print();
        System.out.println("-----------------");
        System.out.println("Artist : " + artist);
        System.out.println("Label : " + label);
        System.out.println("Number of songs : " + numSong);
    }

}
    
