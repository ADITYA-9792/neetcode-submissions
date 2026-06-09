class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        int a= 0;

    HashMap<Integer,Integer> map=new HashMap<>();
    for(int ele: nums){
        map.put(ele,map.getOrDefault(ele,0)+1);
        if(map.get(ele)>n){a=ele;}
    }
    
    return a;
   
    }
}