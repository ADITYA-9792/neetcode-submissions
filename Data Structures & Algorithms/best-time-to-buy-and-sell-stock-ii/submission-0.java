class Solution {
    public int maxProfit(int[] prices) {
       int maximum=Integer.MAX_VALUE;
       int minimum=Integer.MIN_VALUE;
       int buy=prices[0];
       int count=0;
       
        for(int j=0;j<prices.length-1;j++){
            
            if((prices[j+1]-prices[j])>0){
                buy=prices[j+1];
                count+=prices[j+1]-prices[j];
            }

        
       }
       return count;

    }
}