
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = t.toCharArray();
        Arrays.sort(arr);
        
        char[] arr1 = s.toCharArray();
        Arrays.sort(arr1);
        return Arrays.equals(arr1,arr);
        }
        
}
