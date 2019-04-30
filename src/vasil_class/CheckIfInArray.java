package vasil_class;

import java.util.Arrays;

public class CheckIfInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=25;

int []nums= {22,55,58,98,65};
boolean present=false;
for(int num:nums) {
	if(num==n) {
		present=true;
		break;
	}
}
System.out.println("Is "+n+" present in the array? "+present);
	
System.out.println(Arrays.toString(nums));
	}

}
