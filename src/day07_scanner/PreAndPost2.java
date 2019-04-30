package day07_scanner;

public class PreAndPost2 {
public static void main(String[] args) {
	int messages=10;
	messages++;
	++messages;
	System.out.println(messages);
	
	int redMessages=--messages;
	System.out.println(redMessages);//10
	System.out.println(messages);
	int unredMessages=redMessages--;
	System.out.println(unredMessages);//11
	
	int total=unredMessages++ - redMessages--;
	System.out.println(total);//1
	System.out.println(unredMessages);//12
	System.out.println(redMessages);//9
	
	int count=20;
	int count2=10;
	int totalCount=++count + --count2;
	System.out.println(count);//21
	System.out.println(count2);//9
	System.out.println(totalCount);//30
	               //21      //23
	int myCount= count++ + ++count;
	System.out.println(myCount);//44
	
	
	
}
}
