// Bubble sorting 
// Below function always runs O(n^2) time even if the  array is sorted . it can be optimized by stopping the algorithm if inner loop did'nt cause any swap

package sorting_algoritham;

public class BubbleSorting {

	public static void main(String[] args) {
		
		BubbleSorting bs = new  BubbleSorting();
		int arr[] = {3, 5 , 1 , 8 , 10 ,13 ,20 ,22};
		bs.bubbleSort(arr);
		System.out.println("Sorted Array is :");
		printArray(arr);
		
	}
	
	static void bubbleSort(int arr[]) {
		int n = arr.length;
		
		for(int i=0 ; i < n-1 ; i++ ) {
			
			for(int j =0 ; j < n-i-1 ; j++) {
				
				 if(arr[j] > arr[j+1]) {
					 
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
			}
		}
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			System.out.println(arr[i]);
		}
	}
}
