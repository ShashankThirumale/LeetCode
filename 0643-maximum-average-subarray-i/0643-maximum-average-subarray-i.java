class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = 0;
        int left = 0;
        int right = k-1;
        int sum = 0;
        for(int i = 0; i < k; i++){
            max+=nums[i];
        }
        sum = max;
        while(right+1 < nums.length){
            sum-=nums[left++];
            sum+=nums[++right];
            if(sum > max){
                max = sum;
            }
        }
        return max/(double)k;
    }
}