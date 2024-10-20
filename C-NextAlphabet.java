import java.util.Scanner;
public class NextAlphabet {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        char c = myObj.next().charAt(0);
        int ch = (int)c;
        char nextchar = ' ';
        if(ch>=97&&ch<122){
            ch++;
            nextchar = (char)ch;
        }else if(ch==122){
            ch = 97;
            nextchar = (char)ch;
        }
        System.out.println(nextchar);
    }
}
