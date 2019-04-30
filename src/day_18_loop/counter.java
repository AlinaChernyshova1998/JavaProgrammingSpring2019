package day_18_loop;

public class counter {
public static void main(String[] args) throws InterruptedException {
	int num=1;
	while(num <=10){
	System.out.print(num+", ");	
	num++;
	Thread.sleep(1000);//pause the code execution for a second
	}
	System.out.println("\nNum value after loop: "+num);	
	
	int num2=11;
	while(num2>=1) {
		System.out.print(num2+",");
		num2--;
		Thread.sleep(5985);
	}
}
}
