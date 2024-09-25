public class DVD extends Product {
    private int length;
    private String rating;
    private String studio;

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getStudio() {
		return this.studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}


    
    public DVD() {
        length = 0;
        rating = "G";
        studio = "Universal";
    }

	public DVD(String name, int number, int quantity, double price, int length, String rating, String studio) {
		super(name, number, quantity, price);
		this.length = length;
		this.rating = rating;
		this.studio = studio;
	}

    @Override
    public void print() {
        super.print();
        System.out.println("-----------------");
        System.out.println("Length : " + length);
        System.out.println("Rating : " + rating);
        System.out.println("Studio : " + studio);
    }

    



}
