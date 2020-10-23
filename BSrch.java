public class BSrch {
    public static void main(String[] args) {

        int[] arr = {5, 6, 9, 14, 22, 38};

        System.out.println(binarySearch(arr, 22));
        
    }

    public static int binarySearch(int[] arr, int t) {
        int l = 0;
        int r = arr.length - 1;

        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(arr[mid] == t) {
                return mid;
            }
            else if(arr[mid] < t) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return -1;
    }
    
}
