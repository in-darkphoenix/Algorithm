public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {5, 9, 4, 6, 7, 2, 3, 1, 8, 0};
        quickSort(arr, 0, arr.length - 1);

        for(int val : arr) {
            System.out.print(val+" ");
        }

        System.out.println();
        
    }

    public static void quickSort(int[] arr, int lo, int hi) {
        // base caes
        if(lo >= hi) {
            return;
        }

        // partitioning
        int mid = (lo + hi)/2;
        int pivot = arr[mid];

        int left = lo;
        int right = hi;

        while(left <= right) {
            while(arr[left] < pivot) {
                left++;
            }
            while(arr[right] > pivot) {
                right--;
            }
            if(left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // two subproblems
        quickSort(arr, lo, right);
        quickSort(arr, left, hi);
    }
    
}
