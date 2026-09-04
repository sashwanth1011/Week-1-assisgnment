import java.util.Scanner;

public class WordLengthProfiler {

    public static void classifyWordLengths(String review) {
        String[] words = review.trim().split("\\s+");
        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (String word : words) {
            // Remove punctuation attached to words for accurate length measurement
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            int length = cleanWord.length();

            if (length >= 1 && length <= 4) {
                shortCount++;
            } else if (length >= 5 && length <= 8) {
                mediumCount++;
            } else if (length >= 9) {
                longCount++;
            }
        }

        System.out.printf("Short: %d | Medium: %d | Long: %d%n", shortCount, mediumCount, longCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter review text: ");
        String review = scanner.nextLine();

        classifyWordLengths(review);
        scanner.close();
    }
}