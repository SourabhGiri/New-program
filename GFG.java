package JAVA;

public class GFG {
    // Function to check number is
    // binary or not
    public static boolean isBinaryNumber(int num)
    {

        // Regex to check a number
        // is binary or not
        String regex = "[01][01]+";

        // Match the given number with
        // the regular expression
        return Integer
                .toString(num)
                .matches(regex);
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given Number
        int N = 1010;
        System.out.println(isBinaryNumber(N));
    }
}