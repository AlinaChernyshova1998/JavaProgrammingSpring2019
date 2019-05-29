package CodingBut;

public class NoTriples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(noTriples(new int [] {1, 1, 2, 2, 2, 1}));
	}
	public static boolean noTriples(int[] nums) {
		  for(int i=0; i<nums.length-2; i++){
		    if(nums[i]==nums[i+1] && nums[i]==nums[i+2]){
		      return false;
		    }   
		  }
		return true;
		}
	
}
