import java.util.*;
class UnionOfArrays{
    static int CountOfunionArray(int a[],int n,int b[],int m){
        n=a.length;
        m=b.length;
        int[] resultArr=new int[n+m];
        System.arraycopy(a,0,resultArr,0,n);
        System.arraycopy(b,0,resultArr,n,m);
        Arrays.sort(resultArr);
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int elements: resultArr){
            set.add(elements);
        }
        int[] finalArr=new int[set.size()];
        int index=0;
        for(int elements: set){
            finalArr[index++]=elements;
        }
        int count=finalArr.length;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        System.out.print(CountOfunionArray(a,n,b,m));
    }
}