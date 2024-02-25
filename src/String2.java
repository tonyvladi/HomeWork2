import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter any string");
        String userString = sc.nextLine();
        if(userString.isEmpty()){
            System.out.println("the string is empty, please write something");
            userString = sc.nextLine();
        }
        System.out.println("please enter target symbol");
        char userSymbol= sc.next().charAt(0);

        System.out.println("please enter symbol for changing");
        char targetSymbol= sc.next().charAt(0);

        char[] arrOfChars =  userString.toCharArray();
        for(int i=0; i<arrOfChars.length;i++){
            if(arrOfChars[i]==userSymbol){
                arrOfChars[i]=targetSymbol;
            }
        }
        System.out.println(userString);
        System.out.println("target symbol is: " + "-" + targetSymbol + "-");
        System.out.println("symbol for exchange is: " + "-" +userSymbol+ "-");
        System.out.println();
        String modifiedString = String.copyValueOf(arrOfChars);
        System.out.println(modifiedString);
    }
}
