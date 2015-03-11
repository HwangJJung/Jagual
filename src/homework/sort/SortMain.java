package homework.sort;

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

	int[] merge_sort(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int idx = 0;
		while (true) {
			if (i < arr1.length && j < arr2.length) {
				if (arr1[i] == arr2[j]) {
					System.out.println(i + "arr1: " + arr1[i] + "  " + j
							+ "arr2: " + arr2[j]);
					result[idx] = arr1[i];
					idx++;
					result[idx] = arr2[j];
					i = i + 1;
					j = j + 1;
					System.out.println(idx + "  " + result[idx]);
				} else if (arr1[i] > arr2[j]) {
					System.out.println(i + "arr1: " + arr1[i] + "  " + j
							+ "arr2: " + arr2[j]);
					result[idx] = arr2[j];
					j = j + 1;
					System.out.println(idx + "  " + result[idx]);
				} else {
					System.out.println(i + "arr1: " + arr1[i] + "  " + j
							+ "arr2: " + arr2[j]);
					result[idx] = arr1[i];
					i = i + 1;
					System.out.println(idx + "  " + result[idx]);
				}
			} else if (i < arr1.length) {
				result[idx] = arr1[i];
				i++;
			} else if (j < arr2.length) {
				result[idx] = arr2[j];
				j++;
			} else {
				break;
			}
			idx++;
		}
		return result;
	}
}