class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i < nums.length; i++){
            maxHeap.add(nums[i]);
        }
        int result = 0;
        for(int j = 0; j < k; j++){
            result = maxHeap.poll();
        }
        return result;
    }
}