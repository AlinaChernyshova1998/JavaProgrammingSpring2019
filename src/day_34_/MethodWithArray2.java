package day_34_;
import java.util.*;
public class MethodWithArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Arrays.toString(MethodReturnArray.getArray()));
int [] names=MethodReturnArray.getArray();
System.out.println(Arrays.toString(names));
//for(;;) {//it will looping while true
	System.out.println(Arrays.toString(getRandomArray(2)));	
	int [] randomNums=MethodWithArray2.getRandomArray(6);
	System.out.println(Arrays.toString(randomNums));	
}

	//}
public static int[] getRandomArray(int size) {
	Random random = new Random();//create random class object
	int [] nums = new int[size];//declare array with size number of elements
	for(int i=0; i<size;i++) {
		nums[i]=random.nextInt(101);
 	
	}
	return nums;
	
}
}
