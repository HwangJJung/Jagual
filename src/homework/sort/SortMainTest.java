package homework.sort;

import static org.junit.Assert.*;
import org.junit.Test;

public class SortMainTest {

	
	@Test
	public void sort_함수가_제대로_작동한다() {
		SortMain s = new SortMain();
		int[] arr = {4,2,3,1};
		int[] NewArr = s.insertion_sort(arr);
		int[] CorrectArr = {1,2,3,4};
		assertArrayEquals(CorrectArr,NewArr);
	}
	
	@Test
	public void 정렬배열엔_isSorted가_True_리턴한다() {
		SortMain s = new SortMain();
		int[] arr = {1,2,3,4};
		assertTrue(s.isSorted(arr));
	}
	
	@Test
	public void 정렬되지않은_배열엔_isSorted가_False_리턴한다() {
		SortMain s = new SortMain();
		int[] arr = {1,3,2,4};
		assertEquals(false,s.isSorted(arr));
	}
	
	@Test
	public void 원소갯수가_0개_정렬가능하다() {
		SortMain s = new SortMain();
		int[] arr = new int[0];
		arr = s.insertion_sort(arr);
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("");
		assertTrue(s.isSorted(arr));
	}
	
	@Test
	public void 원소갯수가_1개_정렬가능하다() {
		SortMain s = new SortMain();
		int[] arr = {1};
		arr = s.insertion_sort(arr);
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("");
		assertTrue(s.isSorted(arr));
	}
	
	@Test
	public void 원소갯수가_2개_정렬가능하다() {
		SortMain s = new SortMain();
		int[] arr = {1,2};
		arr = s.insertion_sort(arr);
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("");
		assertTrue(s.isSorted(arr));
	}
	
	@Test
	public void 원소갯수가_n개_정렬가능하다() {
		SortMain s = new SortMain();
		int[] arr = {1,6,2,3,7,9,10,11,67,21};
		arr = s.insertion_sort(arr);
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("");
		assertTrue(s.isSorted(arr));
	}
	
	@Test
	public void 이미_정렬된_배열_정렬가능하다() {
		SortMain s = new SortMain();
		int[] arr = {1,2,3,4,5,6,7,8};
		arr = s.insertion_sort(arr);
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("");
		assertTrue(s.isSorted(arr));
	}
	
	@Test
	public void 역으로_정렬된_배열_정렬가능하다() {
		SortMain s = new SortMain();
		int[] arr = {8,7,6,5,4,3,2,1};
		arr = s.insertion_sort(arr);
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("");
		assertTrue(s.isSorted(arr));
	}
	
	@Test
	public void 랜덤_정렬_정렬가능하다() {
		SortMain s = new SortMain();
		int[] arr = {4,3,2,1,5,6,7,8};
		arr = s.insertion_sort(arr);
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("");
		assertTrue(s.isSorted(arr));
	}
	
	@Test
	public void 동일한_숫자가_있는_배열_정렬가능하다() {
		SortMain s = new SortMain();
		int[] arr = {1,5,6,7,8,1};
		arr = s.insertion_sort(arr);
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("");
		assertTrue(s.isSorted(arr));
	}
	
	
}
