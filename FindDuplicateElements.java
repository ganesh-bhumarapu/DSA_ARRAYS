import java.util.*;
class FindDuplicateElements{
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        n=arr.length;
        for(int i=0;i<n;i++){// it modifies the given array by
            int index=arr[i]%n;// dividing the elements by n and taking the remainder and
            arr[index]+=n;// adding the n value to arr[index] value
        }
        for(int i=0;i<n;i++){// it stores the duplicate elements
            if((arr[i]/n)>=2){// by dividing the modified array elements by n and if the quotient is greater than 2 then
                ans.add(i);// adding the the index value to new arraylist
            }
        }
        if(ans.isEmpty()){// if the ans array is empty add -1 to it
            ans.add(-1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(duplicates(arr,n));
    }
}