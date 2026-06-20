class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int p = 0;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);

            if (map.get(ele) >= 2) {
                p = ele;
            }
        }

        // koi duplicate hi nahi mila
        if (p == 0 && !map.containsKey(0)) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == p) {
                list.add(i);
            }
        }

        Collections.sort(list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) <= k) {
                return true;
            }
        }

        return false;
    }
}