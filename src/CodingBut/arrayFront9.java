package CodingBut;

public class arrayFront9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(arrayFront9(new int [] {1, 2, 9, 3, 4}));
	}
	public static  boolean arrayFront9(int[] nums) {
		  for(int i=0; i<nums.length-1; i++){
		    if(nums[i]==9){
		      return true;
		    }else{
		      return false;
		    }
		  }
		return false;
		}

}
