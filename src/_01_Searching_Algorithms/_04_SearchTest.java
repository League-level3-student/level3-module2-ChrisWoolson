package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] array = {"one", "two", "three", "four", "five", "six"};
		assertEquals(3, _00_LinearSearch.linearSearch(array, "four"));
		
		String[] array1 = {"C", "h", "r", "i", "s"};
		assertEquals(2, _00_LinearSearch.linearSearch(array1, "r"));
		
		String[] array2 = {"uno", "dos", "tres"};
		assertEquals(0, _00_LinearSearch.linearSearch(array2, "uno"));
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
int[] array = {1,2,3,4,5};
assertEquals(0, _01_BinarySearch.binarySearch(array, 0, 4, 1));

int[] array2 = {1,2,3};
assertEquals(2, _01_BinarySearch.binarySearch(array2, 0, 2, 3));

int[] array3 = {2,4,6,8,10};
assertEquals(4, _01_BinarySearch.binarySearch(array3, 0, 4, 10));
	
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	int[] array = {1, 2, 3, 4, 5};
assertEquals(0, _02_InterpolationSearch.interpolationSearch(array, 1));
int[] array1 = {2, 4, 6, 8, 10, 12};
assertEquals(4, _02_InterpolationSearch.interpolationSearch(array1, 10));
int[] array2 = {1,2,3,4,5,6,7,8};
assertEquals(4, _02_InterpolationSearch.interpolationSearch(array2, 5));
	
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] array = {1,2,3,4,5};
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(array, 3));

		int[] array2 = {1,2,3};
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(array2, 1));

		int[] array3 = {2,4,6,8,10};
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(array3, 10));
	
	}
}
