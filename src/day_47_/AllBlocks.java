package day_47_;

public class AllBlocks {
	int nonStaticInt=10;
	static int staticInt=10;
	
static {
	System.out.println("STATIC BLOCK- I run first and only once");
	staticInt--;
}
{
	System.out.println("Init BLOCK- I run each time object is created. Before constractor.");
	nonStaticInt+=5;
	staticInt+=5;
	}
public AllBlocks() {
	System.out.println("Constractor- I run each time object is created, after init blocks");
	nonStaticInt+=3;
	staticInt+=3;
}
}
