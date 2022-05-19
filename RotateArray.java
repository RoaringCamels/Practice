/**
 * This method rotates an array of type int by n amount and printing it out
 */
public class RotateArray {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.println("The intital array is: ");
        printStandard(nums);

        System.out.println();

        rotateLeft(nums, 2, nums.length);
        System.out.println("The array after rotating to the left n times: ");
        printStandard(nums);
    }

    /**
     * Rotates an array to the left by n amounts
     * 
     * @param array          An array with type int
     * @param amountToRotate The amount of rotations we want of typ int
     */
    public static void rotateLeftByOne(int array[], int n) {
        int temp;
        int i;// pointer to keep track of where we are in the array
        temp = array[0]; // temporary array to hold vlues
        for (i = 0; i < n - 1; i++) { // traverse through the array
            array[i] = array[i + 1];// shifts the values of the array to the left
        }
        array[i] = temp;// set the counter to the temporary array
    }

    public static void rotateLeft(int array[], int d, int n) {
        for (int i = 0; i < d; i++) {
            rotateLeftByOne(array, n);
        }
    }

    /**
     * Prints out the entire array normally
     * 
     * @param nums an array with type int
     */
    public static void printStandard(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            System.out.print(nums[i] + " ");
            i++;
        }
    }
}