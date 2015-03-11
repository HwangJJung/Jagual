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

	public static int[] copyOfRange(int[] original, int from, int to) {
		int newLength = to - from;
		if (newLength < 0)
			throw new IllegalArgumentException(from + " > " + to);
		int[] copy = new int[newLength];

		System.arraycopy(original, from, copy, 0,
				Math.min(original.length - from, newLength));
		return copy;
	}

	int[] merge_sort(int[] arr) {
		
		if(arr.length != 1){
			int end = arr.length;
			int center = end / 2;

			int[] leftArr = new int[center + 1];
			int[] rightArr = new int[end - center + 1];

			for (int i = 0; i < center; i++) {
				leftArr[i] = arr[i];
				System.out.print(leftArr[i] + ", ");
			}
			for (int i = center; i < end; i++) {
				int idx = i - center;
				rightArr[idx] = arr[i];
				System.out.print(rightArr[idx] + ", ");
			}
			merge_sort(leftArr);
			merge_sort(rightArr);
			
			
		}
		
//
//		System.out.println("");
//		for (int i = 0; i < leftArr.length; i++) {
//			System.out.print(leftArr[i] + ", ");
//		}
//		System.out.println("leftArr");
//		for (int i = 0; i < rightArr.length; i++) {
//			System.out.print(rightArr[i] + ", ");
//		}
//		System.out.println("rightArr");
//		System.out.println("--------");
		int i = 0;
		int j = 0;
		
		for(int k=0; k<arr.length;k++) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[i];
				j++;
			}
		}
		
		
		int[] result = merge_sort(leftArr,rightArr);
		return result;
	}
	
//			10 𝑖=1
//			11 𝑗=1
//			12 for𝑘=𝑝to𝑟 
//			13 if 𝐿 𝑖 <= 𝑅 𝑗 
//			14 𝐴𝑘 =𝐿𝑖 
//			15 𝑖=𝑖+1
//			￼￼￼￼16 else 𝐴 𝑘 = 𝑅 𝑗 
//			17 𝑗=𝑗+1

	int[] merge_sort(int[] leftArr, int[] rightArr) {
		int[] result = new int[leftArr.length + rightArr.length];
		int i = 0;
		int j = 0;
		int idx = 0;
		while (true) {
			if (i < leftArr.length && j < rightArr.length) {
				if (leftArr[i] == rightArr[j]) {
					System.out.println(i + "leftArr: " + leftArr[i] + "  " + j
							+ "rightArr: " + rightArr[j]);
					result[idx] = leftArr[i];
					idx++;
					result[idx] = rightArr[j];
					i = i + 1;
					j = j + 1;
					System.out.println(idx + "  " + result[idx]);
				} else if (leftArr[i] > rightArr[j]) {
					System.out.println(i + "leftArr: " + leftArr[i] + "  " + j
							+ "rightArr: " + rightArr[j]);
					result[idx] = rightArr[j];
					j = j + 1;
					System.out.println(idx + "  " + result[idx]);
				} else {
					System.out.println(i + "leftArr: " + leftArr[i] + "  " + j
							+ "rightArr: " + rightArr[j]);
					result[idx] = leftArr[i];
					i = i + 1;
					System.out.println(idx + "  " + result[idx]);
				}
			} else if (i < leftArr.length) {
				result[idx] = leftArr[i];
				i++;
			} else if (j < rightArr.length) {
				result[idx] = rightArr[j];
				j++;
			} else {
				break;
			}
			idx++;
		}
		return result;
	}
}