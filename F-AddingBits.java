import java.util.Scanner;
public class AddingBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long result = A ^ B;
        System.out.println(result);
    }
}
