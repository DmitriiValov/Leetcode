
/**
 * <a href="https://leetcode.com/problems/count-primes/">204. Count Primes</a>
 */

public class _204 {

    public  static class Solution {
        public int countPrimes(int n) {
            int count = 0;
            boolean[] sieve= new boolean[n+1];
            for (int i = 2; i < n; i++){
                if (!sieve[i]){
                    count++;
                    for (int j = i; j <= n; j += i){
                        sieve[j] = true;
                    }
                }
            }
            return count;
        }
    }
}
