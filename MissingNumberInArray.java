
import java.util.*;
class MissingNumberInArray{
    static int missingNumber(int array[], int n) {
        //sum approach
        int sum = (n(n + 1) / 2);
        int sum1 = 0;
        for (int i = 0; i < n - 1; i++) {
            sum1 += array[i];
        }
        return sum - sum1;
    }
    //xor approach
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor2=xor2^array[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^n;
        return xor1^xor2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n-1; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(missingNumber(array,n));
    }

}
