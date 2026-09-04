import java.util.Scanner;

public class SeatDuplicationChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seat numbers separated by space:");
        String input = scanner.nextLine();
        
        String[] parts = input.split("\\s+");
        int[] seatNumbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            seatNumbers[i] = Integer.parseInt(parts[i]);
        }

        checkDuplicateSeats(seatNumbers);
        scanner.close();
    }
}