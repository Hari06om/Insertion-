import java.util.*;

public class quest3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        char[] arr = new char[n];
        // display the array
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.next().charAt(0);
        }
        // reversed the array 
        System.out.println("The reversed array is :");
        for(int i = n-1 ; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}