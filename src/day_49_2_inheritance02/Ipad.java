package day_49_2_inheritance02;

import day_49_.Device;

public class Ipad extends Device {
	// Ipad is a Device. Ipad IS-A Sub class in different package
	public void readEbook(String title) {
		System.out.println("i am reading " + title + " book" + " using " + brand + " ipad");
		System.out.println("model-"+model);
		//System.out.println("Price: "+price); not visible <default>
	}

}
