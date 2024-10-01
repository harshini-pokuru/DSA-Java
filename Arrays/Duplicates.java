import java.util.*;
public class Duplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        //Removing Duplicates
        for(int i:map.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();

        //Printing Duplicates
        for(int i:map.keySet()){
            if(map.get(i) >1){
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
}
