/*
 arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]
// and place it at beginning
11 25 12 22 64

// Find the minimum element in arr[1...4]
// and place it at beginning of arr[1...4]
11 12 25 22 64

// Find the minimum element in arr[2...4]
// and place it at beginning of arr[2...4]
11 12 22 25 64

// Find the minimum element in arr[3...4]
// and place it at beginning of arr[3...4]
11 12 22 25 64
 */
package sorting_algoritham;

public class SelectionSorting {

	public static void main(String[] args) {
		int arr[] = {64 ,25 ,12 ,22 ,11};
		int n = arr.length;
		selectionSort(arr , n);
		System.out.println("sorted array is :");
		printArray(arr ,n);
	}
	
	static void selectionSort(int arr[] , int n) {
		
		for(int i =0 ; i < n-1 ; i++) {
			
			int min_index = i;
			
			for(int j =i+1 ; j < n ; j++) 
				if(arr[j] <arr[min_index]) 
					min_index = j;
				int temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;
			}
		
	}
	
	static void printArray(int arr[] , int n) {
		
		for(int i =0 ; i<n ; ++i) {
			System.out.println(arr[i]);
		}
		
	}
}
