/**
 * 
 */
import java.util.*;
/**
 * @author Jia Chen Huang
 * @version March 16, 2020
 *
 */
public class Assignment4 {

	/**
	 * sort the array with selection sort, recursive
	 * @param <T>
	 * @param theArray: the array to be sorted
	 * @param n: length of array
	 */
	public static <T extends Comparable<? super T>> void recursiveSelectionSort (T[] theArray, int n)
	{
		T temp = null;
		if(n < 1)
		{
			System.out.println("The result for Selection Sort:\n" + Arrays.deepToString(theArray) + "\n");
			return;
		}
		else
		{
			int max_ind = max(theArray, n); // index for the largest;
			temp = theArray[n - 1];
			theArray[n - 1] = theArray[max_ind];
			theArray[max_ind] = temp;
			recursiveSelectionSort (theArray, n - 1);
		}
	}

	/**
	 * sort the array with bubble sort, recursive
	 * @param <T>
	 * @param theArray: the array to be sorted
	 * @param n: length of array
	 */
	public static <T extends Comparable<? super T>> void recursiveBubbleSort (T[] theArray, int n)
	{
		T temp = null;
		if(n < 1)
		{
			System.out.println("The result for Bubble Sort:\n" + Arrays.deepToString(theArray) + "\n");
			return;
		}
		else
		{
			for(int i = 0; i < n - 1; i++)
			{
				if(theArray[i].compareTo(theArray[i+1])>0)
				{
					temp = theArray[i];
					theArray[i] = theArray[i+1];
					theArray[i+1] = temp;
				}
			}
			recursiveBubbleSort(theArray , n-1);
		}
	}

	/**
	 * finds the max value in a given array
	 * @param arr: the array
	 * @return the index for the largest number
	 */
	public static <T extends Comparable<? super T>> int max(T[] theArray, int n)
	{
		int maxVal = (int) theArray[0];
		int j = 0;
		for(int i = 0 ; i < n; i++)
		{
			if((int) theArray[i] > maxVal)
			{
				maxVal = (int) theArray[i];
				j = i;
			}
		}
		return j;
	}
	/**
	 * 
	 */
	public Assignment4() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr = {29, 10, 14, 37, 13};
		recursiveSelectionSort(arr, 5);
		recursiveBubbleSort(arr, 5);
	}

}
