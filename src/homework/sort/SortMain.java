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

	public int[] mergeSort(int[] arr) {
		if (arr.length == 0) {
		} else {
			mergeSort(arr, 0, arr.length - 1);
		}
		for(int i=0; i < arr.length; i++) {
		//	System.out.print(arr[i]+", ");
		}
		return arr;
	}

	public void mergeSort(int[] arr, int from, int to) {
		int newLength = to - from;
		if (0 < newLength) {
			int mid = from + newLength / 2;
			mergeSort(arr, from, mid);
			mergeSort(arr, mid + 1, to);
			merge(arr, from, mid, to);

		}
	}

	public void merge(int[] arr, int from, int mid, int to) {
		int[] buffer = new int[arr.length];
		int i = from;
		int j = mid + 1;
	
		for (int ß = from; ß<=to; ß++) {
			buffer[ß] = arr[ß];
		}
		
		try{
			for (int k = from; k <= to; k++) {
				if (i > mid) {
					arr[k] = buffer[j++];
				} else if (j > to) {
					arr[k] = buffer[i++];
				} else if (buffer[i] < buffer[j]) {
					arr[k] = buffer[i++];
				}else{
					arr[k] = buffer[j++];
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}

//	int[] merge(int[] leftArr, int[] rightArr) {
//		int[] result = new int[leftArr.length + rightArr.length];
//		int i = 0;
//		int j = 0;
//		int idx = 0;
//		while (true) {
//			if (i < leftArr.length && j < rightArr.length) {
//				if (leftArr[i] == rightArr[j]) {
//					System.out.println(i + "leftArr: " + leftArr[i] + "  " + j
//							+ "rightArr: " + rightArr[j]);
//					result[idx] = leftArr[i];
//					idx++;
//					result[idx] = rightArr[j];
//					i = i + 1;
//					j = j + 1;
//					System.out.println(idx + "  " + result[idx]);
//				} else if (leftArr[i] > rightArr[j]) {
//					System.out.println(i + "leftArr: " + leftArr[i] + "  " + j
//							+ "rightArr: " + rightArr[j]);
//					result[idx] = rightArr[j];
//					j = j + 1;
//					System.out.println(idx + "  " + result[idx]);
//				} else {
//					System.out.println(i + "leftArr: " + leftArr[i] + "  " + j
//							+ "rightArr: " + rightArr[j]);
//					result[idx] = leftArr[i];
//					i = i + 1;
//					System.out.println(idx + "  " + result[idx]);
//				}
//			} else if (i < leftArr.length) {
//				result[idx] = leftArr[i];
//				i++;
//			} else if (j < rightArr.length) {
//				result[idx] = rightArr[j];
//				j++;
//			} else {
//				break;
//			}
//			idx++;
//		}
//		return result;
//	}

}