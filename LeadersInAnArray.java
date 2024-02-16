import java.util.*;
class LeadersInAnArray{
    static ArrayList<Integer> leaders(int[] arr,int n){
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=1;
        while(i<n && j<n){
            if(arr[i]<arr[j]){
                i=j;
                j=i+1;
            }else{
                j++;
                if(j==n){
                    ans.add(arr[i]);
                    i++;
                    j=i+1;
                }
            }
        }
        ans.add(arr[n-1]);
        return ans;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]+=sc.nextInt();
        }
        System.out.println(leaders(arr,n));
    }
}
