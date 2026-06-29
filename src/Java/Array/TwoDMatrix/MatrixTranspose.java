package Array.TwoDMatrix;

public class MatrixTranspose {

    public static void transpose(int [][] mat){
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0 ; i<row;i++){
            for (int j = i+1 ;j<col;j++){
                swap(mat , i,j,j,i);
            }
        }
    }

    public static void swap (int [][]mat , int i , int j , int k , int l ){
        int temp = mat[i][j];
        mat[i][j] = mat[k][l];
        mat[k][l] = temp;
    }

    public static void main(String[] args) {
        int [][] mat = { {1,2,3},
                         {4,5,6},
                         {7,8,9}
                        };

        System.out.println("Before transpose  :- ");
        for (int i  = 0  ; i<mat.length;i++){
            for(int j =0 ;j<mat[0].length;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        // trranspose the matrix
        transpose(mat);;

        System.out.println("After transpose the matric :- ");
        // after transpose the matrix
        for (int i = 0 ; i<mat.length;i++){
            for (int j = 0 ;j<mat[0].length;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

    }
}
