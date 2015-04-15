package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchValueTest {

	@Test
	public void 배열이_1개일때() {
		int[] arr = {1};
		Object result = SearchValue.serach(arr, 1);
		assertEquals(0, result);
	}
	@Test
	public void 배열이_2개일때() {
		int[] arr = {1,2};
		Object result = SearchValue.serach(arr, 1);
		assertEquals(0, result);
	}
	@Test
	public void 배열의_첫번째일때() {
		int[] arr = {1,2,3,4,5,6};
		Object result = SearchValue.serach(arr, 1);
		assertEquals(0, result);
	}
	@Test
	public void 배열의_마지막일때() {
		int[] arr = {1,2,3,4,5,6};
		Object result = SearchValue.serach(arr, 6);
		assertEquals(5, result);
	}
	@Test
	public void 배열의_중간지점일때() {
		int[] arr = {1,2,3,4,5,6};
		Object result = SearchValue.serach(arr, 4);
		assertEquals(3, result);
	}
	@Test
	public void 배열에_값이_없을때() {
		int[] arr = {1,2,3,4,5,6};
		Object result = SearchValue.serach(arr, 7);
		assertEquals(null, result);
	}
}
