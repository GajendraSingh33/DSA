class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        HashSet<Integer> intersect = new HashSet<>();
        for(int j=0; j<nums2.length; j++){
            if(set.contains(nums2[j])){
                intersect.add(nums2[j]);
            }
        }

        int[] result = new int[intersect.size()];
        int index = 0;
        for(int num : intersect){
            result[index++] = num;
        }

        return result;
    }
}