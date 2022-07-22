public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 4, 5 };
        printStandard(nums1);
        System.out.println(containsDuplicate(nums1, nums1.length));

        int nums2[] = { 1, 2, 3, 4, 1 };
        printStandard(nums2);
        System.out.println(containsDuplicate(nums2, nums2.length));
    }

    public static boolean containsDuplicate(int array[], int arrayLength) {
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Prints out the entire array normally
     * 
     * @param nums an array with type int
     */
    public static void printStandard(int[] nums) {
        System.out.println("The contents of the array: ");
        int i = 0;
        while (i < nums.length) {
            System.out.print(nums[i] + " ");
            i++;
        }
    }
}