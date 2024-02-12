import java.util.*;
class KOKOEatingBananas{
    static int findMax(int[] piles){
        int N=piles.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            max=Math.max(max,piles[i]);
        }
        return max;
    }
    static int calculateTotalHrs(int[] piles,int H){
        int totalH=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            totalH += Math.ceil((double)(piles[i]) / (double)(H));
        }
        return totalH;
    }
    public static int Solve(int N, int[] piles, int H) {// here we take the array as the range between the 1 and the max value
        // for ex if max is 11 then arr will be 1,2,3,4,5,6,7,8,9,10,11.
        int low=1;
        int high=findMax(piles);
        while(low<=high){
            int mid=(low+high)/2;
            int totalH=calculateTotalHrs(piles,mid);
            if(totalH<=H){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int H=sc.nextInt();
        int[] piles=new int[N];
        for(int i=0;i<N;i++){
            piles[i]+=sc.nextInt();
        }
        System.out.println(Solve(N,piles,H));
    }
}
