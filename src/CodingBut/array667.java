package CodingBut;

public class array667 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(array667(new int [] {6, 6, 2, 6}));
	}
	public static int array667(int[] nums) {
		int count=0;
		for(int i=0; i<nums.length-1; i++){
		  if(nums[i]==6 && nums[i+1]==6 || nums[i]==6 && nums[i+1]==7) {
		    count++;
		  }
		}
		return count;
		}

}
