class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int p= nums.length/3;
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
           
        }
        for(int key : map.keySet()){
            if(map.get(key)>p){
                list.add(key);
            }
        }
        return list;
    }
}