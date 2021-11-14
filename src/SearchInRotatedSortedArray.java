import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int [] nums =new int[]{1};
		System.out.println(search(nums,1));
	}

	public static int search(int[] nums, int target) {
		int ans= -1;
		int [] originalArray = Arrays.copyOf(nums,nums.length);
		Arrays.sort(nums);
		int left = 0 ;
		int righ = nums.length-1;
		while(left <= righ) {
			int mid = (left + righ) / 2;
			if (nums[mid] > target) {
				righ = mid - 1;

			} else if(nums[mid] < target){
				left = mid + 1;
			} else if(nums[mid] == target) {
				//ans = originalArray[mid];
				ans = indexOf(target, originalArray);

				break;
			}

		}

			return ans;


	}

	public static int indexOf(int needle, int [] haystack)
	{
		for (int i=0; i<haystack.length; i++)
		{
			if (haystack[i]== (needle))
					 return i;
		}

		return -1;
	}
}
