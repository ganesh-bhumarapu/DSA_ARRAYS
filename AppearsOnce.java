import java.util.*;
class AppearsOnce{
    public static int search(int A[], int N){
        int xor=0;
        for(int i=0;i<N;i++){
            xor=xor^A[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        System.out.println(search(A,N));
    }
}
