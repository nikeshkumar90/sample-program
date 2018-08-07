package sorting_algoritham;

public class OptimizedBubbleSorting {
	
	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; 
		int n = arr.length;
		optimizedBubbleSort(arr ,  n);
		System.out.println("Sorted Array is :");
		printArray(arr , n);
	}
	
	static void optimizedBubbleSort(int arr[] , int n) {
		boolean swapped;
	 for (int i=0 ; i < n-1 ;i++) 
	 {
			 swapped = false;
		 for(int j =0 ; j < n-i-1 ; j++)
		 {
				
			if(arr[j] > arr[j+1]) 
			{
				int temp = arr[j];
				 arr[j] = arr[j+1];
				 arr[j+1] = temp;
				 swapped = true ;
			}
				
		 }
			if(swapped == false)
				break;
	}
		
	}
	
	static void printArray(int arr[] , int n) {
		
		for(int i =0 ; i < n ; i++) {
			System.out.println(arr[i]);
		}
	}

}
