public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5, 9, 4, 6, 7, 2, 3, 1, 8, 0};
        selectionSort(arr);

        for(int val : arr) {
            System.out.print(val+" ");
        }
        
    }

    public static void selectionSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            int midx = i;

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[midx] > arr[j]) {
                    midx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[midx];
            arr[midx] = temp;
        }
    }
    
}
