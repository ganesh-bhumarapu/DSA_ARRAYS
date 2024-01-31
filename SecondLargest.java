import java.util.*;
class SecondLargest{
    static int Array2Largest(int[] arr, int n){
        int firstLargest=-1;
        int secondLargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }else if(arr[i]<firstLargest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
        public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
        System.out.println(Array2Largest(arr,n));
    }
}
