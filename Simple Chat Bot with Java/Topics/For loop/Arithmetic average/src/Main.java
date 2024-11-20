import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = 0;
        double count = 0;

        for (int i = (int) a; i <= (int) b; i++) {
            if (isDivisibleBy3(i)) {
                sum += i;
                ++count;
            }
        }
        System.out.println(sum / count);

    }

    public static boolean isDivisibleBy3(double a)  { return a % 3 == 0; }

}