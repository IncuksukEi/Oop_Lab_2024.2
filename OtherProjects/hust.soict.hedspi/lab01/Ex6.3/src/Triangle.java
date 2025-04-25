import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = input.nextInt();

        for (int i=1 ; i<=height; i++){
            for(int  j=0; j<(height*2-i*2+1)/2; j++ ){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
