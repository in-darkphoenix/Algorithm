public class Mrg2SA {
    public static void main(String[] args) {
        int[] one = {1, 5, 9, 17, 19, 45};
        int[] two = {2, 3, 8, 12, 13, 14, 22, 30};
        
        int[] ans = mergeTwoSortedArrays(one, two);

        for(int val : ans) {
            System.out.print(val+" ");
        }
        
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
