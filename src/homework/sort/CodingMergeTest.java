package homework.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodingMergeTest {

	@Test
	public void 짝수_배열이_반으로_나뉘어져_2개의배열이_된다() {
		SortMain s = new SortMain();
		int[] arr = {1,2,4,3};
		int[] run = s.merge_sort(arr);
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected, run);
	}
	
	@Test
	public void 홀수_배열이_반으로_나뉘어져_2개의배열이_된다() {
		SortMain s = new SortMain();
		int[] arr = {1,5,3,2,7};
		int[] a = s.merge_sort(arr);
		int[] expected = {1,2,3,5,7};
		assertArrayEquals(expected, a);
	}

}
