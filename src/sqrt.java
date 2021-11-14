public class sqrt {
	public static void main(String[] args) {
		// x = 4   sqrt = 2;
		// x = 8   sqrt = 2;
		System.out.println(sqrt(2147395599));
	}
	public static int sqrt(int x) {
		if (x == 0 || x == 1)
			return x;
		int start = 1, end = x /2;
		int ans = 0;
		while (start <= end) {
			long mid = (start + end) / 2;
			long sqr = mid * mid;
			if (sqr == x)
				return (int) mid;
			if (sqr < x) {
				start = (int) mid + 1;
				ans = (int ) mid;
			}
			else {
				end = (int) mid - 1;
				}
		}
		return ans;
	}
}
