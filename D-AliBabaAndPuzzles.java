import java.util.Scanner;
public class AliBabaAndPuzzles {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long a = myObj.nextLong();
        long b = myObj.nextLong();
        long c = myObj.nextLong();
        long d = myObj.nextLong();
        if(a*b+c==d||a-b+c==d||a+b*c==d||a-b*c==d||a+b-c==d||a*b-c==d||a+b*c==d||a+b-c==d||a*b+c==d||a*b-c==d||a-b+c==d||a-b*c==d){
            System.out.println("YES");
        }else{
         System.out.println("NO");   
        }
    }
}
