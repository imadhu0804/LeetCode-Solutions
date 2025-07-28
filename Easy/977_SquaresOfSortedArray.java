class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] result= new int[n];
        int left=0,right=n-1,index=n-1;
        while(left<=right){
            int leftsqr=nums[left] * nums[left];
            int rightsqr=nums[right] * nums[right];
            if(leftsqr>rightsqr){
                result[index--]=leftsqr;
                left++;
            }else{
                result[index--]=rightsqr;
                right--;
            }
        }
        return result;
    }
}
