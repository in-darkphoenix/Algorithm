public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 9, 4, 6, 7, 2, 3, 1, 8, 0};
        insertionSort(arr, 10);

        for(int val : arr) {
            System.out.print(val+" ");
        }
        
    }

    public static void insertionSort(int[] arr, int n) {
        for(int i = 1; i < n; i++) {

            int val = arr[i];
            int j = i - 1;

            while(j >=0 && arr[j] > val) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = val;

        }
    }
    
}
