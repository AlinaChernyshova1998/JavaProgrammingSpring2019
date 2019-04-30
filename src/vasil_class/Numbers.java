package vasil_class;

public class Numbers {
public static void main(String [] args) {
	System.out.println(findMin(new int []{5,41,66,89}));
	System.out.println(findMax(new int []{5,41,66,89,86,99}));
	double[] doubleNum= {12.36,52.69,856.25};
	double m2=findMin1(doubleNum);
	System.out.println(Numbers.findMin1(doubleNum));
}
public static int findMin(int [] arr) {
	int min=arr[0];
	for(int i=0; i<arr.length; i++) {
		if(arr[i]<min) {
			min=arr[i];
			
		}
	}
	return min;
	
}
public static int findMax(int [] arr1) {
	int max=arr1[0];
	for(int i=0; i<arr1.length; i++) {
		if(arr1[i]>max) {
			max=arr1[i];
			
		}
	}
	return max;
}
public static double findMin1(double [] arr) {
	double min=arr[0];
	for(int i=0; i<arr.length; i++) {
		if(arr[i]<min) {
			min=arr[i];
			
		}
	}
	return min;
}
}