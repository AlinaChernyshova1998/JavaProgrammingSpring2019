package vasil_class;

public class UniqueWords2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "jjavabook";
		for (int i = 0; i < str.length(); i++) {
			//read one char from str and store to temp
			char temp = str.charAt(i);// j
			//inner loop will help to compare with other char
			int count =0;
			for (int j = 0; j < str.length(); j++) {
				if (temp == str.charAt(j) && i != j) {
					count++;
					//System.out.println(temp + " is duplicated");
				}
			}
			if(count==0) {//==0 because it is showing us unique char
				System.out.println(temp + " is unique");
			}

		}
	}
}