package BinarySearch.TwoDMatrix;

public class FindPeakEleTwo {
    public static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m-1;
        while (low <= high){
            int mid = low +(high -low)/2;
            int row = maxEle(mat,n,m,mid);
            int left = (mid-1 >=0) ? mat[row][mid-1] : -1;
            int right = (mid+1 <m) ? mat[row][mid+1] :-1;
            int ele = mat[row][mid];
            if (left < ele && right <ele) return new int [] {row,mid};
            else if (ele < left) high = mid-1;
            else low = mid+1;
        }return new int []  {-1,-1};
    }

    public static int maxEle(int [][] mat ,int n , int m , int col){
        int ans = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0;i<n;i++){
            if (ans <mat[i][col]){
                ans = mat[i][col];
                idx = i;
            }
        }return idx;
    }

    static void main(String[] args) {
        int[][] mat = {
                {10, 20, 15},
                {21, 30, 14},
                {7, 16, 32}
        };
        int[] ans = findPeakGrid(mat);

        System.out.println("Peak found at: [" + ans[0] + ", " + ans[1] + "]");
        System.out.println("Peak value: " + mat[ans[0]][ans[1]]);
    }
}
