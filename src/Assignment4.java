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

	public static <T extends Comparable<? super T>> void recursiveSelectionSort (T[] theArray, int n)
	{
		if(n < 1)
		{
			System.out.println("The array is invalid");
		}
		else
		{
			int max_ind = max(theArray); // index for the largest;
			System.out.println(max_ind);
		}
	}

	public static <T extends Comparable<? super T>> void recursiveBubbleSort (T[] theArray, int n)
	{
		return;
	}

	/**
	 * finds the max value in a given array
	 * @param arr: the array
	 * @return the index for the largest number
	 */
	public static <T extends Comparable<? super T>> int max(T[] theArray)
	{
		int maxVal = (int) theArray[0];
		int j = -1;
		for(int i = 0 ; i < theArray.length; i++)
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
	}

}
