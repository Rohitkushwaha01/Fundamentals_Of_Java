package basicArray;

//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: 2
//Explanation: 3 is a peak element and your function should return the index number 2.
//Example 2:
//
//Input: nums = [1,2,1,3,5,6,4]
//Output: 5 or 2
//Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.


public class PeakElement {
	public static void main(String[] args) {
		int[] arr = {1,2,1,3,5,6,4};
		System.out.print(findPeakElement(arr));
	}
	
	public static int findPeakElement(int[] nums) {
		for(int i = 0; i < nums.length-1; i++){
            if(nums[i]>nums[i+1]) return i; 
        }
        return nums.length-1;
    }

}
