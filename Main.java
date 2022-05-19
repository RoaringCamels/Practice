public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6 };
        int j = 0;
        j = removeDuplicates(nums, nums.length);
        System.out.println("There are " + j + " unique integers.");
        printArray(nums, j);
    }

    // ************************************************************* */

    /**
     * Prints out the integers of an array without the dupes
     * 
     * @param nums an array with type int
     */
    public static void printArray(int[] nums, int j) {
        for (int k = 0; k < j; k++) {
            System.out.print(nums[k] + " ");
        }
    }

    /**
     * Prints out the entire array normally
     * 
     * @param nums an array with type int
     */
    public static void printArray2(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            System.out.print(nums[i] + " ");
            i++;
        }
    }

    /**
     * Removes duplicates of an array using extra space and two pointers
     * 
     * @param nums An array of type int
     * @param n    the length of the array
     * @return integer j with the amount of unique integers
     */
    public static int removeDuplicates(int[] nums, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[n - 1];
        return j;
    }
}
