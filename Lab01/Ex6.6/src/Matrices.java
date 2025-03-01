import java.util.Scanner;
public class Matrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Col=input.nextInt();
        int Row=input.nextInt();
        int[][]  Matrix1 = new int[Row][Col];
        int[][]  Matrix2 = new int[Row][Col];
        System.out.println("Enter the elements of the matrices 1: ");
        for(int i=0; i<Row; i++) {
            for (int j = 0; j < Col; j++) {
                Matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of the matrices 2: ");
        for(int i=0; i<Row; i++){
            for(int j=0; j<Col; j++){
                Matrix2[i][j]=input.nextInt();
            }
        }
        int[][]  MatrixSum = new int[Row][Col];
        for(int i=0; i<Row; i++){
            for(int j=0; j<Col; j++){
                MatrixSum[i][j]=Matrix1[i][j] + Matrix2[i][j];
            }
        }
        System.out.print("The sum of the elements of the matrices 1 and 2: ");
        for(int i=0; i<Row; i++){
            System.out.print("\n");
            for(int j=0; j<Col; j++){
                System.out.print(MatrixSum[i][j]+" ");
            }
        }
    }
}
