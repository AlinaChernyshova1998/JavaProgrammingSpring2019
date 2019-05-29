package CodingBut;

public class ArrayCount9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(arrayCount9(new int [] {1,1,9,9,9,2}));
	}
	public static int arrayCount9(int[] nums) {
		  int count=0;
		  for(int i=0; i<nums.length; i++){
		  
		      if(nums[i]==9){
		        count ++;
		      
		      
		    }
		  }
		  return count;
		}

}
