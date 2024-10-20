import java.util.Scanner;
public class Katryoshka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long e = scanner.nextLong();  
        long m = scanner.nextLong(); 
        long b = scanner.nextLong();  
        long count = 0;
        long useFirstCombination = Math.min(e, Math.min(m, b));
        count += useFirstCombination;
        e -= useFirstCombination;
        m -= useFirstCombination;
        b -= useFirstCombination;
        long useSecondCombination = Math.min(e / 2, b);
        count += useSecondCombination;
        System.out.println(count);
    }
}
