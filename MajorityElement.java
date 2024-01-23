import java.util.*;
class MajorityElement {
    public static int majorityElemrntInArray(int[] arr,int n){
        int count=0;
        int ele=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                ele=arr[i];
            }else if(arr[i]==ele){
                count++;
            }else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                count1++;
            }
        }if(count1>n/2){
            return ele;
        }
        return -1;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
        System.out.println(majorityElemrntInArray(arr,n));
    }
}
