package homework.sort;

public class JaeBong {
	private int[] dumpArray;
	private int[] returnArray;

	public int[] start(int[] arr) {
		if (arr.length == 0)
			return arr;
		this.returnArray = arr;
		this.dumpArray = new int[arr.length];
		mergeSort(0, arr.length - 1);
		return returnArray;
	}

	private void mergeSort(int start, int end) {
		int middle = start + (end - start) / 2;
		if (start < end) {
			mergeSort(start, middle);
			mergeSort(middle + 1, end);
			merge(start, middle, end);
		}
	}

	public void merge(int start, int middle, int end) {
		int leftStart = start;
		int rightStart = middle + 1;
		int count = start;
		for (int i = start; i <= end; i++)
			dumpArray[i] = returnArray[i];
		while (leftStart <= middle && rightStart <= end) {
			if (dumpArray[leftStart] > dumpArray[rightStart])
				returnArray[count++] = dumpArray[rightStart++];
			else
				returnArray[count++] = dumpArray[leftStart++];
		}
		while (leftStart <= middle)
			returnArray[count++] = dumpArray[leftStart++];
	}
}