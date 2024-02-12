import java.util.*;
class FindtheNthRoot{
    static int func(int mid,int n,int m){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans*=m;
            if(ans>m){
                return 2;
            }
        }
        if(ans==m){
            return 1;
        }
        return 0;
    }
    static int Nthroot(int n,int m){
        int low=1;
        int high=m;
        while(low<=high){
            int mid=(low+high);
            int midN=func(mid,n,m);
            if(midN==1){
                return mid;
            }else if(midN==2){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(Nthroot(n,m));
    }
}
