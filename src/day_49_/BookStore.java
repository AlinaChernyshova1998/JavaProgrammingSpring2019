package day_49_;

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EBook eBook= new EBook();
eBook.setTitle("Java Introduction");
eBook.setAuthor("Walter Sawitch");
eBook.setPages(1016);
eBook.setPrice(150);
eBook.setType("tech book");
eBook.setSize(490);
System.out.println(eBook.getTitle());
System.out.println(eBook.getAuthor());
System.out.println(eBook.getPages());
System.out.println(eBook.getPrice());
System.out.println(eBook.getType());
System.out.println(eBook.getSize());
eBook.readEbook(25);


AudioBook audiobook= new AudioBook();
audiobook.setAuthor("Marina Lutska");
audiobook.setLength(366);
audiobook.setNarrator("Murafjon");
audiobook.setTitle("Java");
audiobook.setType("Tech book");
System.out.println(audiobook.getAuthor());
System.out.println(audiobook.getLength());
System.out.println(audiobook.getNarrator());
System.out.println(audiobook.getTitle());
System.out.println(audiobook.getType());
audiobook.listen();



PaperBook paperBook= new PaperBook();
paperBook.setAuthor("Malcom Grifin");
paperBook.setPages(368);;
paperBook.setTitle("My life");
paperBook.setType("Biography");
paperBook.setPrice(256.25);
System.out.println(paperBook.getPrice());
System.out.println(paperBook.getAuthor());
System.out.println(paperBook.getTitle());
System.out.println(paperBook.getType());
System.out.println(paperBook.getPages());
System.out.println(paperBook.toString());
	}

}
