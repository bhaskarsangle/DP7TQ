package com.oops;


class Book{
	int id;
	String  bName;
	String aName;
	String pDate;
	double price;
	char category;
	public Book(int id, String bName, String aName, String pDate, double price, char category) {
		super();
		this.id = id;
		this.bName = bName;
		this.aName = aName;
		this.pDate = pDate;
		this.price = price;
		this.category = category;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getpDate() {
		return pDate;
	}
	public void setpDate(String pDate) {
		this.pDate = pDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double discount) {
		this.price = discount;
	}
	public char getCategory() {
		return category;
	}
	public void setCategory(char category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bName=" + bName + ", aName=" + aName + ", pDate=" + pDate + ", price=" + price
				+ ", category=" + category + "]";
	}
	
	
}

public class StudentBook {
	
	static void bookDiscount(Book b) {
		if (b.category=='S') {
			double discount=(b.getPrice())-(b.getPrice()*0.10);
			b.setPrice(discount);
		}
	}

	public static void main(String[] args) {
          Book book1=new Book(12, "java", "bhaskar", "12/1/1998", 300, 'S');
          Book book2=new Book(13, "c", "rama", "12/11/1995", 400, 'o');
          Book book3=new Book(14, "python", "ganu", "12/10/1999", 500, 'S');
          
          
          System.out.println(book1);
          System.out.println(book2);
          System.out.println(book3);
          
          System.out.println("=========after Discount on category 'S'==========");
          
          bookDiscount(book1);
          bookDiscount(book2);
          bookDiscount(book3);
          
          
          System.out.println(book1);
          System.out.println(book2);
          System.out.println(book3);



	}

}
