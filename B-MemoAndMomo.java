import java.util.Scanner;
public class MemoAndMomo {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long a = myObj.nextLong();
        long b = myObj.nextLong();
        long k = myObj.nextLong();
        if(a>0&&b>0){
            if(a%k==0&&b%k==0){
                System.out.println("Both");
            }else if(a%k==0&&b%k!=0){
                System.out.println("Memo");
            }else if(a%k!=0&&b%k==0){
                System.out.println("Momo");
            }else if(a%k!=0&&b%k!=0){
                System.out.println("No One");
            }
        }
    }
}
