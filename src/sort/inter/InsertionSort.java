package sort.inter;

public class InsertionSort implements Sort {

	@Override
	public int[] sort(int[] arr) {
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
}
