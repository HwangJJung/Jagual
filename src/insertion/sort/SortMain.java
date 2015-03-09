package insertion.sort;

public class SortMain {

	int[] insertion_sort(int[] arr) {
		int idx, subIdx, key;
		for (idx = 1; idx < arr.length; idx++) {
			key = arr[idx];
			subIdx = idx - 1;
			while (subIdx >= 0 && arr[subIdx] >= key) {
				arr[subIdx + 1] = arr[subIdx];
				subIdx--;
			}
			arr[subIdx + 1] = key;
		}
		return arr;
	}

	boolean isSorted(int[] arr) {
		int idx;
		boolean result = true;
		for (idx = 0; idx < arr.length - 1; idx++) {
			if (arr[idx] > arr[idx + 1]) {
				result = false;
				break;
			}
		}
		return result;
	}
}
