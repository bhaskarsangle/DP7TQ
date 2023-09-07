package com.oops;

 
class Item {
	private int id;
	private String name;
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Item(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class Shop {

	static void discount(Item i) {
		if (i.getPrice() > 200) {
			int p = i.getPrice();
			p = (int) (p - (p * .1));
			i.setPrice(p);
		}
	}

	public static void main(String[] args) {
		Item item1 = new Item(110, "pen", 25);
		Item item2 = new Item(111, "pizza", 250);
		Item item3 = new Item(112, "burger", 210);
		Item item4 = new Item(113, "bag", 500);
		Item item5 = new Item(114, "jacket", 230);
		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);
		System.out.println(item4);
		System.out.println(item5);

		System.out.println("=======after Discount======");
		discount(item1);
		discount(item2);
		discount(item3);
		discount(item4);
		discount(item5);
		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);
		System.out.println(item4);
		System.out.println(item5);

	}

}
