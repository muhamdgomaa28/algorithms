package binarySearch;

public class guessNumberHigherOrLower {
	public static void main(String[] args) {

	}

	static int guess(int x){return 0;}
	public static int guessNumber(int n) {
		int left = 1, right = n;
		while (left <= n) {
			int mid = left + (right - left) / 2;
			int g = guess(mid); // will return three values 1. -1 .0
			if (g == 0) {
				return mid;
			}
			else if (g == 1) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return 0;
	}
}
