package test;

public class SearchValue {
	static Object serach(int[] arr, int v) {
		Object result = null;
		int i = 0;
			while (result == null && i < arr.length) {
				if (arr[i] == v) {
					result = i;
				}
				i++;
			}
		return result;
	}
}
