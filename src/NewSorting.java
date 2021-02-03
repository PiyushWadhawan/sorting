
public class NewSorting {

	public static void main(String[] args) 
	{
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		int n = arr.length;
		int i, key, j;  
	    for (i = 1; i < n; i++) 
	    {  
	        key = arr[i];  
	        j = i - 1;  
	        while (j >= 0 && arr[j] > key) 
	        {  
	            arr[j + 1] = arr[j];  
	            j = j - 1;  
	        }  
	        arr[j + 1] = key;  
	    }  
	        System.out.println("Sorted usuing Insertion sort");
	        for (i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	}

}
