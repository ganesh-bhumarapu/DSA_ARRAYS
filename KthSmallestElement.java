import java.util.*;
class KthSmallestElement{
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int i = l; i <= r; i++) {
            if (maxPQ.size() < k) {// until the size of the heap less than the k value we will add elements to the heap
                maxPQ.offer(arr[i]);
            } else {
                if (maxPQ.peek() > arr[i]) {// if the topmost element is greater than the current array element then
                    maxPQ.poll();// remove the element from the heap
                    maxPQ.offer(arr[i]);// and then add the current element from the array
                }
            }
        }
        return maxPQ.peek();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        int r=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(kthSmallest(arr,l,r,k));
    }
}