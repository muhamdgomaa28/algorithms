package binarySearch;

public class binarySearch {
	public static void main(String[] args) {
		int [] sortedArray = new int[] {1,3,5,7,9};
		System.out.println(runBinarySearch(sortedArray, 3));
	}

	public static int runBinarySearch(int [] sortedArray, int item) {
		int low = 0;
		int high = sortedArray.length - 1;
		int index = Integer.MAX_VALUE;
		while (low <= high) {
			int mid = (low + high) / 2 ;
			if(sortedArray[mid] > item) {
				high = mid - 1 ;
			} else if (sortedArray[mid] < item){
				low = mid + 1;
			} else {
				index = mid;
				break;
			}
		}

		return index;
	}

}
