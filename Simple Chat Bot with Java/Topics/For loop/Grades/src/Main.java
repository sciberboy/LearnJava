import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine().trim());
        int[] counts = new int[4];

        for (int i = 0; i < counter; i++) {
            String input = scanner.nextLine().trim();
            char grade = input.charAt(0);
            switch (grade) {
                case 'A':
                    counts[0]++;
                    break;
                case 'B':
                    counts[1]++;
                    break;
                case 'C':
                    counts[2]++;
                    break;
                case 'D':
                    counts[3]++;
                    break;
                default:
                    System.out.println("Error");
            }
        }
        scanner.close();

        for (int i = 3; i >= 0; i--) {
            System.out.print(counts[i] + " ");
        }
    }
}