public class Product {
    private String name;
    private int number, quantity;
    private double price;

    public Product() {
        number = 0;
        quantity = 0;
        price = 0.0;
        name = "default";
    }
	public String getName() {
		return this.name;
	}

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void print() {
        System.out.println("Product Name : " + name);
        System.out.println("Product Number : " + number);
        System.out.println("Product Quantity : " + quantity);
        System.out.println("Product Price : " + price);
    }

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}