import java.util.Scanner;

public class IntervalSweep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();  
        int b = scanner.nextInt();
        if (Math.abs(a - b) <= 1 && (a > 0 || b > 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
