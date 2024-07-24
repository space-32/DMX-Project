// File: StringManipulation.java

public class StringManipulation {

    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Example 1: Convert to Upper Case
        String upperStr = str.toUpperCase();
        System.out.println("Upper Case: " + upperStr);

        // Example 2: Convert to Lower Case
        String lowerStr = str.toLowerCase();
        System.out.println("Lower Case: " + lowerStr);

        // Example 3: Find Length of String
        int length = str.length();
        System.out.println("Length: " + length);

        // Example 4: Replace Characters
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced: " + replacedStr);

        // Example 5: Substring
        String substring = str.substring(7, 12);
        System.out.println("Substring: " + substring);

        // Example 6: Check if String Contains a Substring
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);

        // Example 7: Split String
        String[] splitStr = str.split(", ");
        System.out.println("Split: ");
        for (String s : splitStr) {
            System.out.println(s);
        }

        // Example 8: Trim Leading and Trailing Spaces
        String strWithSpaces = "  Hello, World!  ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed: '" + trimmedStr + "'");
    }
}
