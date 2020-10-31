public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {5, 9, 4, 6, 7, 2, 3, 1, 8, 0};
        arr = mergeSort(arr, 0, 9);

        for(int val : arr) {
            System.out.print(val+" ");
        }

        System.out.println();
        
    }

    public static int[] mergeSort(int[] arr, int lo, int hi) {

        if(lo == hi) {
            int[] br = new int[1];
            br[0] = arr[lo];
            return br;
        }

        int mid = (lo + hi)/2;

        int[] fh = mergeSort(arr, lo, mid);
        int[] sh = mergeSort(arr, mid + 1, hi);

        int[] merged = mergeTwoSortedArrays(fh, sh);

        return merged;

    }

    public static int[] mergeTwoSortedArrays(int[] one, int[] two) {
        int[] ans = new int[one.length + two.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<one.length && j<two.length) {
            if(one[i] < two[j]) {
                ans[k] = one[i];
                i++;
                k++;
            }
            else {
                ans[k] = two[j];
                j++;
                k++;
            }
        }

        if(i == one.length) {
            while(j < two.length) {
                ans[k] = two[j];
                j++;
                k++;
            }
        }

        if(j == two.length) {
            while(i < one.length) {
                ans[k] = one[i];
                i++;
                k++;
            }
        }

        return ans;
    }
    
}
