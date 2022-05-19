public class PlusOne {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 9 };
        printStandard(nums);
        calculate(nums, nums.length);

        System.out.println("After adding one the value is: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    /**
     * Treats the array as a whole integer and adds the value 1 to it
     * 
     * @param array       An array of type int
     * @param arrayLength The length of the array
     * @return returns an array with added 1
     */
    public static int[] calculate(int array[], int arrayLength) {
        for (int i = arrayLength - 1; i >= 0; i--) {// traverses the array starting from the end
            if (array[i] < 9) {// have to consider when we add 1 to 9.. that is 10
                array[i]++;// we increment the value in that index as long as it is lees than 9
                return array;
            }
            array[i] = 0; // if it is not less than 9 we make that value 0
        }
        int[] newNumber = new int[arrayLength + 1];// this is just in case the value at index 0, when incremented, is
                                                   // greater than 9
        newNumber[0] = 1;

        return newNumber;
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
        System.out.println();
    }
}
