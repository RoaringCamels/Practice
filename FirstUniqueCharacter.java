import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String string = "aabb";
        System.out.println(firstUniqueChar(string));
    }

    /**
     * This method finds the first non-repeating character in the string and returns
     * its index by creating a hashmap and then traversing it
     * 
     * @param string a string of type String
     * @return The index of type int of the first unique charter
     */
    public static int firstUniqueChar(String string) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = string.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = string.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(string.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
