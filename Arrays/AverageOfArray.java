import java.util.*;
public class AverageOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        float avg = (float) sum/n;
        System.out.println(avg);
        sc.close();
    }
}
