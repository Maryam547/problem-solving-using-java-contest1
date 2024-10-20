import java.util.Scanner;
public class WinterSale {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        int p = myObj.nextInt();
        double before = p/(1-(x/100.00));
        System.out.printf("%.2f\n",before);
    }
}
