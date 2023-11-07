package practise;

public class FirstUniqueCharacter {

    public static char findFirstUniqueCharacter(String s) {
        int[] count = new int[26]; // Assuming the input contains only lowercase English letters

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Find the first unique character
        for (char c : s.toCharArray()) {
            if (count[c - 'a'] == 1) {
                return c;
            }
        }

        // If no unique character is found, return a default value
        return '\0';
    }

    public static void main(String[] args) {

        int b = 'a'-'l';
        System.out.println(b);

        String str = "leetcode";
        char result = findFirstUniqueCharacter(str);
        if (result != '\0') {
            System.out.println("The first unique character is: " + result);
        } else {
            System.out.println("No unique character found.");
        }
    }
}

