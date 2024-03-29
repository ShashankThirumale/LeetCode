class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low < high){
            int mid = (high-low)/2 + low;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return nums[low];
    }
}