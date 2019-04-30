package vasil_class;

public class WordsInside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(makeOutWord("<<>>", "Yay"));
	}
	public static String makeOutWord(String out, String word) {
		  return out.substring(0,2)+word+out.substring(out.length()-2);
}
}