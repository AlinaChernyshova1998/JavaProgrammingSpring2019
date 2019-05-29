package day_49_;

public class PaperBook extends Book{
private int pages;

public String toString() {
	return "Title: "+ getTitle()+" | author: "+getAuthor()+" | price: "+getPrice()+" | type: "+getType()+" | pages: "+pages;
	
}



public int getPages() {
	return pages;
}

public void setPages(int pages) {
	this.pages = pages;
}

}
