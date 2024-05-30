
    import java.util.Scanner;

public class PatternSearchKMP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();   // Input the string
        String pattern = scanner.nextLine(); // Input the pattern

        System.out.println(countOccurrences(text, pattern));
        scanner.close();
    }

    public static int countOccurrences(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] pi = computePrefixFunction(pattern);
        int count = 0;

        int j = 0; // Length of previous longest prefix suffix
        for (int i = 0; i < n; i++) {
            while (j > 0 && pattern.charAt(j) != text.charAt(i)) {
                j = pi[j - 1];
            }
            if (pattern.charAt(j) == text.charAt(i)) {
                j++;
            }
            if (j == m) {
                count++; // Found a match
                j = pi[j - 1]; // Look for the next match
            }
        }

        return count;
    }

    public static int[] computePrefixFunction(String pattern) {
        int m = pattern.length();
        int[] pi = new int[m];
        int j = 0; // Length of previous longest prefix suffix

        for (int i = 1; i < m; i++) {
            while (j > 0 && pattern.charAt(j) != pattern.charAt(i)) {
                j = pi[j - 1];
            }
            if (pattern.charAt(j) == pattern.charAt(i)) {
                j++;
            }
            pi[i] = j;
        }

        return pi;
    }
}
    
