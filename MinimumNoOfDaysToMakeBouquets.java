import java.util.*;
class MinimumNoOfDaysToMakeBouquets{
    static boolean countBouquets(int[] bloomDay,int day,int M,int K){
        int count=0;
        int NoOfB=0;
        int N=bloomDay.length;
        for(int i=0;i<N;i++){
            if(bloomDay[i]<=day){
                count++;
            }else{
                NoOfB+=(count/K);
                count=0;
            }
        }
        if(NoOfB>M){
            return true;
        }else{
            return false;
        }
    }
    static int solve(int[] bloomDay,int M,int K){
        long value=(long)M*K;
        int N=bloomDay.length;
        if(value>N){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        int low=min;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(countBouquets(bloomDay,mid,M,K)){
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
        int M= sc.nextInt();
        int K= sc.nextInt();
        int[] bloomDay=new int[N];
        for(int i=0;i<N;i++){
            bloomDay[i]=sc.nextInt();
        }
        System.out.println(solve(bloomDay,M,K));
    }
}
