public class ReverseInteger {
    public static void main(String[] args) {
        String string = "01203";
        System.out.println("The intital string is: " + string);

        System.out.println("The reversed string is: ");
        reverseInteger(string);
    }

    /**
     * This method converts the string into a character array by using a built in
     * java String class method toCharArray(). Then, scan the string from the end to
     * the start and prints it one by one. If there is a o in the string, it ignores
     * it.
     * 
     * @param string Input of type String
     */
    public static void reverseInteger(String string) {
        char[] copy = string.toCharArray();
        for (int i = copy.length - 1; i >= 0; i--) {
            if (copy[i] == '0') {
                System.out.print("");
                copy[i]++;
            } else {
                System.out.print(copy[i]);
            }
        }
    }
}
