class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxprice=0;
        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }
            else if(price-minPrice>maxprice){
                maxprice=price - minPrice;
            }
        }
        return maxprice;
    }
}
