package day_43_;

public class MyComputer {
	public static void main(String[] args) {
		Computer computer1 = new Computer();
		Computer computer2 = new Computer();
		System.out.println(computer1.toString());
		computer1.setBrand("IMAC");
		computer1.setOs("maCOS High Sierra");
		computer1.setPrice(1700);
		
		computer2.setBrand("Dell XPS");
		computer2.setOs("Windows 10");
		computer2.setPrice(1000);
		System.out.println(computer1.toString());
		System.out.println(computer2.toString());
		
		Computer computer3= new Computer("ASUS", "Windows 7", 600);
		System.out.println(computer3.toString());
		//change wo=indows 7 to windows 11
		computer3.setOs("Windows 11");
		System.out.println(computer3.toString());
		computer3.setPrice(computer3.getPrice()-200);
		System.out.println(computer3.toString());
	}
}
