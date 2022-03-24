package interfacepack;

public final class Gadgets {
	
	String Name;
	double price;
	int warranty;
	
	Gadgets()
	{
		super();
	}
	
	@Override
	public String toString() {
		return "Gadgets [Name=" + Name + ", price=" + price + ", warranty=" + warranty + "]";
	}

	public Gadgets(String name, double price, int warranty) {
		super();
		Name = name;
		this.price = price;
		this.warranty = warranty;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	

}
