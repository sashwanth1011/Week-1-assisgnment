import java.util.Scanner;

public class TypingAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        int total = original.length();
        int matched = 0;
        int firstMismatchPos = -1;

        for (int i = 0; i < total; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1; // 1-based indexing
            }
        }

        double accuracy = ((double) matched / total) * 100;

        if (firstMismatchPos != -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matched, total, accuracy, firstMismatchPos, 
                    original.charAt(firstMismatchPos - 1), typed.charAt(firstMismatchPos - 1));
        } else {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n", matched, total, accuracy);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter original passage: ");
        String original = scanner.nextLine();
        System.out.print("Enter typed passage: ");
        String typed = scanner.nextLine();

        checkTypingAccuracy(original, typed);
        scanner.close();
    }
}