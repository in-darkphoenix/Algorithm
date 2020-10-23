public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5, 9, 4, 6, 7, 2, 3, 1, 8, 0};
        bubbleSort(arr);

        for(int val : arr) {
            System.out.print(val+" ");
        }
        
    }

    public static void bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            boolean flag = false;

            for(int j = 0; j < arr.length - i - 1; j++) {

                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }

            if(!flag) {
                break;
            }
        }
    }
    
}
