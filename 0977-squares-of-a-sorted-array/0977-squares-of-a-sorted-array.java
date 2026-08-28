class Solution {
    public int[] sortedSquares(int[] nums) {        //O(n)
        int[] arr = new int[nums.length];

        int lp = 0;
        int rp = nums.length-1;

        for(int i = arr.length-1; i>=0; i--){

            int leftSquare = nums[lp]*nums[lp];
            int rightSquare = nums[rp]*nums[rp];

            if(leftSquare > rightSquare){
                arr[i] = leftSquare;
                lp++;
            } else{
                arr[i] = rightSquare;
                rp--;
            }
        }
        return arr;
    }
}