package day_49_;

public class Book {
private String title;
private double price;
private String type;
private String author;



public String toString() {
	return "Book [title=" + title + ", price=" + price + ", type=" + type + ", author=" + author + "]";
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}




}
