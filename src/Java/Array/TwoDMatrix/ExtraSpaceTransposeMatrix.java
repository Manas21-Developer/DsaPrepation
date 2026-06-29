package Array.TwoDMatrix;

public class ExtraSpaceTransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int [][] ans = new int [col][row];

        for (int i = 0 ; i<row ;i++){
            for (int j =  0 ; j<col;j++){
                ans[j][i] = matrix[i][j];
            }
        }return ans;
    }

    static void main(String[] args) {
        int [][] mat = { {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] output = transpose(mat);
        System.out.println("Actual matrix :-");
        for (int i = 0 ; i<mat.length;i++){
            for (int j = 0 ;j<mat[0].length;j++){
                System.out.print(mat[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Output matrix after transpose  :-");
        for (int i = 0 ; i<output.length;i++){
            for (int j = 0 ;j<output[0].length;j++){
                System.out.print(output[i][j] +" ");
            }
            System.out.println();
        }

    }
}
