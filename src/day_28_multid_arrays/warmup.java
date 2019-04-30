package day_28_multid_arrays;

public class warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sentence="you are very interesting person";
String reverse="";
String [] words=sentence.split(" ");
System.out.println(words.length);
for(int i=words.length-1;i>=0; i--) {
	reverse+=words[i]+" ";
}
System.out.println(reverse);
	}

}
