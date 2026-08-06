class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
        
            int j = i+1;
            int k = nums.length-1;

            while(j<k){                          // fix i and move j & k to get the 0;
                int sum = nums[i]+nums[j]+nums[k];

                if (sum > 0){
                    k--;
                } else if(sum < 0){
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while(nums[j] == nums[j-1] && j<k){
                        j++;
                    }
                }

            }
        }
        return res;
    }
}


//iteration 1
//[-1,0,1,2,-1,-4]
//  i j         k

//iteration 2
//[-4,-1,-1,0,1,2]
//     i  j     k