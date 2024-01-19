
import java.util.*;
class IntersectionOfArrays {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        int i = 0;
        int j = 0;
        int count = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        n = a.length;
        m = b.length;
        while (i < n && j < m) {
            if (i > 0 && a[i] == a[i - 1]) {// cdn to ignore duplicates
                i++;
                break;
            }
            if (a[i] < b[j])// checks if a[i] elements is less than b[j] then i will be incremented
                i++;
            else if (b[j] < a[i])
                j++;
            else {// if element in both arrays equal then
                count++;
                i++;
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        System.out.println(NumberofElementsInIntersection(a, b, n, m));
    }

}
