class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> add = new HashMap<>();
       for(int i=0;i<nums.length;i++){
            int num =nums[i];
            int x= target - num;
            if(add.containsKey(x)){
                return new int[] {add.get(x),i};
            }
            add.put(num,i);
        }
        return null;
    }
}
