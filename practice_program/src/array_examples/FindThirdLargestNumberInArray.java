package array_examples;

public class FindThirdLargestNumberInArray {
	
	public static void main(String[] args) {
		
		int a[] = {2,5,1,6,9,3,8,11};
		int length= a.length;
		
		System.out.println("Third Largest Number of an array is :" +thirdLargestNumber(a,length));
	}
	
	public static int thirdLargestNumber(int a[] , int length) {
		
		int temp;
		for(int i=0 ; i<length ;i++) {
				
			for(int j=i+1 ; j<length; j++) {
				
				if(a[i] > a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		return a[length-3];
	}
	

}
