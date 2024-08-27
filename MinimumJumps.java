import java.util.*;
class MinimumJumps{
    public static int minJumps(int[] arr, int n){
        if(n == 1) return 0;
        if(arr[0] == 0) return -1;
        int jumps = 0;
        int current = 0;
        int farthest = 0;
        for(int i = 0; i < n - 1; i++){
            farthest = Math.max(farthest, arr[i] + i);
            if(i == current){
                if(farthest <= i){// If farthest doesn't exceed current, we're stuck
                    return -1;
                }
                current = farthest;
                jumps++;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(minJumps(arr, n));
    }
}