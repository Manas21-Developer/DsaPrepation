package Array.TwoDMatrix;
public class RotateImage {
    public static void rotate(int[][] matrix) {
        // transpose
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0 ;i<row ; i++){
            for (int j = i+1 ;j<col; j++){
                swap(matrix,i,j,j,i);
            }
        }
        // rotate the single arr
        for (int i = 0; i < row; i++) {

            int start = 0;
            int end = col - 1;

            while (start < end) {

                swap(matrix, i, start, i, end);

                start++;
                end--;
            }
        }
    }
    public  static void swap(int [][] arr , int i , int j , int k , int l){
        int temp = arr[i][j];
        arr[i][j] = arr[k][l];
        arr[k][l] = temp;
    }
    static void main(String[] args) {
        int [][] arr ={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        rotate(arr);
        int row  = arr.length;
        int col = arr[0].length;
        for (int i = 0;i<row;i++){
            for(int j = 0 ; j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
