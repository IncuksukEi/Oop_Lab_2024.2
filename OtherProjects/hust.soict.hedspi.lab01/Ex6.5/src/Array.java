import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array :");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array :");
        int sum=0;
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
            sum+=arr[i];
        }
        int tmp;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        double average = (double) sum/n;
        System.out.println("The elements in the array after being sorted: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSum of elements in array: "+sum );
        System.out.println("Average of elements in array: "+average);
    }
}
