import java.util.*;
class allNegativeElementsAtOneEnd {
    public static int[] segregateElement(int[] arr, int n) {
        int[] positiveArr = new int[n];// it is an array which stores all the positive values in the Aarray
        int[] negativeArr = new int[n];// similarly it stores all the negative vales in the given array
        int posIndex = 0;// it gives the count of the number of positives values present in the array
        int negIndex = 0;// it gives the count of the number of negative values present in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {// it checks whether the element is positive or not
                positiveArr[posIndex++] = arr[i];// if yes then it will store the positive value int the positive index and increment the posIndex value
            } else {
                negativeArr[negIndex++] = arr[i];// similarly it will store the negative values and increment the negIndex value
            }
        }
        int[] resultArr = new int[n];// the new array for storing the segregated elements
        System.arraycopy(positiveArr, 0, resultArr, 0, posIndex);// System.arraycopy()-> it is used to copy the elements from one array to other
        System.arraycopy(negativeArr, 0, resultArr, posIndex, negIndex);
        return resultArr;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] resultArr=segregateElement(arr,n);
        for(int num: resultArr){
            System.out.print(num+" ");
        }
    }
}