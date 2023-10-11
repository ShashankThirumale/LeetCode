class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int candy : candies){
            if(candy>max){
                max = candy;
            }
        }
        List<Boolean> result = new ArrayList<Boolean>();
        for(int candy: candies){
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}