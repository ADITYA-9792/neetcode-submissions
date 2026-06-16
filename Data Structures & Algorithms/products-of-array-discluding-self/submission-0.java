class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int prod = 1;
            for(int j=0;j<nums.length;j++){
                if(i==j){                                            
                continue;
                }
                prod*=nums[j];
            }
            product[i]=prod;
            }
        
        return product;
    }
}  
