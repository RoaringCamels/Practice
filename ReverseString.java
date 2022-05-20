public class ReverseString {
    public static void main(String[] args) {
        String word = "Hello!";
        System.out.println("Original String: " + word);

        System.out.println("Reversed: ");
        reverseString(word);
    }

    /**
     * This method converts the string into a character array by using a built in
     * hava String class method toCharArray(). Then, scan the string from the end to
     * the start and prints it one by one
     * 
     * @param string Input of type String
     */
    public static void reverseString(String string) {
        char[] copy = string.toCharArray();
        for (int i = copy.length - 1; i >= 0; i--) {
            System.out.print(copy[i]);
        }
    }

}
