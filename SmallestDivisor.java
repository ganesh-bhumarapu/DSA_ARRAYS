import java.util.*;
class SmallestDivisor{
    static boolean possible(int[] nums,int D,int K){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)(nums[i])/(double)(D));
        }
        if(sum<=K){
            return true;
        }else{
            return false;
        }
    }
    public static int smallestDivisor(int[] nums, int K) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(nums,mid,K)){
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
        int K=sc.nextInt();
        int[] nums=new int[N];
        for(int i=0;i<N;i++){
            nums[i]+=sc.nextInt();
        }
        System.out.println(smallestDivisor(nums,K));
    }
}
