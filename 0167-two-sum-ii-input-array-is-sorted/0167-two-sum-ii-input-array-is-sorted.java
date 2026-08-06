class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0;
        int rp = numbers.length-1;

        while(lp < rp){                         //0(n) & 0(1)
            int sum = numbers[lp]+numbers[rp];

            if(sum==target){            //case1
                return new int[]{lp+1, rp+1};
            }
            else if(sum < target){       //case2
                lp++;
            }
            else{                       //case3
                rp--;
            }
        }
        return new int[]{};
    }
}