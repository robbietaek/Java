package snippet;

public class Menu {

	private int no;
	private String name;
	private int price;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	public Menu(int no, String name, int price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
}
