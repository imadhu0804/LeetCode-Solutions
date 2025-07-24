class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : nums) set.add(num);
        
        int count = 0;
        for (int num : set) {
            count++;
            if (count == 3) return num;
        }

        return set.iterator().next(); 
    }
}
