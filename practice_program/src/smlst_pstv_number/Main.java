//Requirement : Find the Smallest positive number missing from an unsorted array |Set 1
package smlst_pstv_number;

public class Main {
	
	public static void main(String[] args) {
			int arr[] = {2, 3, -7, 6, 8, 1, -10, 15};
			int arr_size = arr.length;
			int missing = findMissing(arr , arr_size);
			System.out.println("The Smallest positive missing number is " +missing);
	}
	
	static int findMissing(int arr[] , int size){
		int shift = segregate(arr ,size);
		int arr2[] = new int[size-shift];
		int j=0;
		for(int i =shift ;i<size;i++){
			arr2[j] = arr[i];
			j++;
		  }
		 return findMissingPositive(arr2 ,j);
	}
	 
	static int findMissingPositive(int arr[] ,int size) {
		
		int i;
	      
	      // Mark arr[i] as visited by making 
	      // arr[arr[i] - 1] negative. Note that 
	      // 1 is subtracted because index start 
	      // from 0 and positive numbers start from 1
	      for(i = 0; i < size; i++)
	      {
	        if(Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
	          arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
	      }
	      
	      // Return the first index value at which 
	      // is positive
	      for(i = 0; i < size; i++)
	        if (arr[i] > 0)
	          return i+1;  // 1 is added becuase indexes 
	                       // start from 0
	      return size+1;
		
	}
	static int segregate (int arr[], int size)
    {
        int j = 0, i;
        for(i = 0; i < size; i++)
        {
           if (arr[i] <= 0)  
           {
               int temp;
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               // increment count of non-positive 
               // integers
               j++;  
           }
        }
      
        return j;
    }
}
