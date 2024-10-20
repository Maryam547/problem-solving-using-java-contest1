import java.util.Scanner;
public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  
        int firstdigit = n%10;
        int seconddigit = (n-firstdigit)/10;
        if(firstdigit%seconddigit==0||seconddigit%firstdigit==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
