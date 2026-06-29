package BinarySearch.Answer;

public class FindNthRootOfM {
    // if (mid^n >  m ) return 2;
    // if (mid^n == m ) return 1;
    // if (mid^n <  m ) return 0;
    public int helper(long mid , int n , int m){
        long ans = 1;
        for (int i  = 0; i<n;i++){
            ans *= mid;
            if(ans > m) return 2;
        }
        if (ans == m) return 1;
        return  0;
    }

    public int nthRoot(int n, int m) {
        // ADDED: edge case — 0th root of 0 is 0, binary search misses this
        // because start=1 skips 0 entirely
        if (m == 0) return 0;
        // ADDED: edge case — nth root of 1 is always 1
        if (m == 1) return 1;
        int start = 1;
        int end = m;

        while (start <= end){
            int mid = start + (end-start) /2;
            int ans = helper(mid,n,m);
            if (ans == 1) return mid;
            else if (ans == 0) start = mid+1;
            else end = mid-1;
        }return -1;
    }
}
