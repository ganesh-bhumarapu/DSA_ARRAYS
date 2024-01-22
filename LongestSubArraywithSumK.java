import java.util.*;
class LongestSubArraywithSumK {
    public static int lenOfLongSubarr (int a[], int n, int k) {
        //Complete the function
        HashMap<Integer,Integer> preSumMap=new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum==k){
                maxLen=Math.max(maxLen,i+1);
            }
            int rem=sum-k;
            if(preSumMap.containsKey(rem)){
                int len=i-preSumMap.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int[] a=new int[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
        System.out.println(lenOfLongSubarr(a,n,k));
    }
}
