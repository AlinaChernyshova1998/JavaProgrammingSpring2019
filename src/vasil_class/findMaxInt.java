package vasil_class;

public class findMaxInt {
	public static void main(String[] args){
		   System.out.println(findMax( new int [] {44,12,11,26,55}));
		   System.out.println(findMax( new double [] {44.55,12,11,26,55}));
		  }
		  public static int findMax(int [] nums){
		    int maximum=nums[0];
		    for(int i=0; i<nums.length; i++){
		      if(nums[i]>maximum){
		        maximum=nums[i];
		      }
		    }
		    return maximum;
		  }
		  public static double findMax(double [] nums){
		    double max=nums[0];
		    for(int i=0; i<nums.length; i++){
		      if(nums[i]>max){
		        max=nums[i];
		      }
		    }
		    return max;
		  } 
		}