package CodingBut;

public class has271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(has271(new int [] {1, 2, 7, 1}));
	}
	public static boolean has271(int[] nums) {
		  for(int i=0; i<nums.length-2; i++){
		    if(nums[i]==2 && nums[i+1]==7 && nums[i+2]==1){
		      return true;
		    }
		  }
		  return false;
		}

}
