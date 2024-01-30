import java.util.*;
class AlternatePositiveAndNegativeNumbers {
    static void rearrange(int[] arr,int n) {
        int[] positive = new int[n];
        int[] negative = new int[n];
        int posCount = 0;
        int negCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positive[posCount++] = arr[i];
            } else {
                negative[negCount++] = arr[i];
            }
        }
        int posIndex = 0;
        int negIndex = 0;
        int resultIndex = 0;
        while (posIndex < posCount && negIndex < negCount) {
            arr[resultIndex++] = positive[posIndex++];
            arr[resultIndex++] = negative[negIndex++];
        }
        while (posIndex < posCount) {
            arr[resultIndex++] = positive[posIndex++];
        }
        while (negIndex < negCount) {
            arr[resultIndex++] = negative[negIndex++];
        }
    }
        public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
        System.out.println(rearrange(arr,n));
    }
}
