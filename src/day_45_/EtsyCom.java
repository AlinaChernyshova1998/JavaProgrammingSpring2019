package day_45_;

public class EtsyCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etsy etsy1 = new Etsy();
		System.out.println(etsy1.toString());
		etsy1.setEmail("alina1000@mail.com");
		etsy1.setName("Alina");
		etsy1.setPassword("bolgaria123");
		System.out.println(etsy1.toString());

		Etsy etsy2 = new Etsy();
		etsy2.setEmail("dfcgggdgcd.info");
		etsy2.setName("alina123");
		etsy2.setPassword("abd1");
		System.out.println(etsy2.toString());

		Etsy etsy3 = new Etsy("alina1000@mail.com", "Alina", "alina1234");
		System.out.println(etsy3.toString());

		Etsy etsy4 = new Etsy("alina1000@mail.com", "Alina", "123");
		System.out.println(etsy4.toString());

		Etsy etsy5 = new Etsy("alina1000@mail.com", "Alina");
		System.out.println(etsy5.toString());

	}
}
