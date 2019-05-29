package day_36_;
import java.util.ArrayList;
public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create an arrayList
		String [] str = new String[5];
		ArrayList<String> names=new ArrayList <>();
		
		int [] numsArray=new int[5];
		ArrayList<Integer> nums=new ArrayList <>();
		//assign values into arraylist
		names.add("Roman");
		names.add("Anna");
		names.add("Alina");
		names.add("Samir");
		nums.add(100);
		nums.add(10);
		//nums.add(e)
		//read from arraylist
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println("Names count : "+names.size());
	}

}
