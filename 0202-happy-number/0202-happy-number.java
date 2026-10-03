class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
        set.add(n);
        int currentSum = 0;
        
        while (n > 0) {
            int digit = n % 10;
            currentSum += digit * digit;
            n /= 10;
        }
        
        n = currentSum;
    }
    
    return n == 1;
    }
}