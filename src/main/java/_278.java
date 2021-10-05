
/**
 * <a href="https://leetcode.com/problems/first-bad-version/">278. First Bad Version</a>
 */

public class _278 {

    public static class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int left = 1;
            int right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if(isBadVersion(mid)) {
                    right = mid;
                }
                else {
                    left = mid + 1;
                }
            }
            return left;
        }
    }
}

class VersionControl {
    private int target = 5;

    public void setTarget(int target) {
        this.target = target;
    }

    boolean isBadVersion(int version) {
        if(version >= target) {
            return true;
        }
        return false;
    }
}
