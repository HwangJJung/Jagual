package homework.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void 맞냐(){
		SortMain s = new SortMain();
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,4,5,6,8};
		int[] arr3 = s.merge_sort(arr1, arr2);
		for(int i=0; i < arr3.length; i++) {
			System.out.print(arr3[i]+", ");
		}
		int [] arr4 = {1,2,3,4,5,5,6,7,8,9};
		System.out.println("");
		assertArrayEquals(arr4,arr3);
	}
}
