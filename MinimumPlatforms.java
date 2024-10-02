import java.util.*;
class MinimumPlatforms{
    public static int minimum(int[] arr, int[] dept){
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dept);
        int platformsNeeded = 1;
        int res = 1;

        int i = 1, j = 0;
        while(i < n && j < n) {
            if (arr[i] <= dept[j]) {// if the arrival of another train is before the departure of other train then we need an extra platform
                platformsNeeded++;
                i++;
            } else {
                platformsNeeded--;// here if the arrival of another train is after the departure of other train then we dont need any extra platform
                j++;
            }
            res = Math.max(res, platformsNeeded);// it stores least possible number of platfroms needed to accomdate all trains
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dept = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            dept[i] = sc.nextInt();
        }
        System.out.println(minimum(arr, dept));
    }
}