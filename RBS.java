import java.util.Scanner;
import java.util.Arrays;

class RBS {
    
    int recursiveSearch(int arr[], int l, int h, int item) {
        if (l <= h) {
            int m = (l + h) / 2;

            if (arr[m] == item) {
                return m; 
            } else if (arr[m] < item) {
                return recursiveSearch(arr, m + 1, h, item); 
            } else {
                return recursiveSearch(arr, l, m - 1, item); 
            }
        }
        return -1; 
    }

    public static void main(String args[]) {
        int n, item, i;
        Scanner sc = new Scanner(System.in);
        BinarySearch binSearch = new BinarySearch();
        
        
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        
        int[] arr = new int[n];
        
        
        System.out.println("Enter " + n + " numbers: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the number to be searched: ");
        item = sc.nextInt();
        int result = binSearch.recursiveSearch(arr, 0, n - 1, item);
 
        if (result == -1) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item found ");
        }
    }
}

