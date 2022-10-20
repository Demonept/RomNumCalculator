import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите математическое выражение: ");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String c = a.toUpperCase();
//        System.out.println(a);
        String b = Filter.filter(c);
//        System.out.println(b);
        }
    public static String calc(String[] input){
        String left = input[0];
        String right = input[2];
        String oper = input[1];
        int fn = Integer.parseInt(left);
        int sn = Integer.parseInt(right);
        int result = 0;
        switch(oper) {
            case"+":
                result = fn+sn;
                break;
            case "-":
                result = fn-sn;
                break;
            case "*":
                result = fn*sn;
                break;
            case "/":
                result = fn/sn;
                break;
        }
        return String.valueOf(result);
    }
//


    }
//        char[] p = {'+','-','/','*'};
//        String[] reg = {"\\+", "-", "/", "\\*"};
//       for( int i = 0; i <= a.length() -1; i++){
//            if(x[i] == "+"){
//                oper = 1;
//                break;
//            }else if(x[i] == "-"){
//                oper = 1;
//                break;
//            }else if(x[i] == "*"){
//                oper = 1;
//                break;
//            }else if(x[i] == "/"){
//                oper = 1;
//                break;}
//        }
//int[] q = {0,1,2,3,4,5,6,7,8,9,10};
//        String[] w = {"0","I","II","II","III","IV","V","VI","VII","VII","VIII","IX","X"};
//        char[] e = {'+','-','*','/'};