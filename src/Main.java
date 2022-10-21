import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите математическое выражение: ");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String c = a.toUpperCase();
        String b = calc(c);
        }

    public static String calc(String input)throws IOException{
        String[] spl = input.split(" ");
        String left = spl[0];
        String right = spl[2];
        String oper = spl[1];
        if(spl.length > 3){
            throw new IOException();
        }else if(spl.length < 3) {
            throw new IOException();
        }
        if(Filter.isRom(left) && Filter.isRom(right)){
            spl[0] = ConvertRom.RomToAr(left);
            spl[2] = ConvertRom.RomToAr(right);
            String result = Main.NotAcalc(spl);
            int res = Integer.parseInt(result);
            String last = ConvertRom.ArToRom(res);
            System.out.println(last);
            return last;
        }
        if(Filter.isRom(left) != Filter.isRom(right)){
            throw new IOException();
        }
        if(Filter.isTen(spl) != true){
            throw new IOException();
        }
        String result = Main.NotAcalc(spl);
        System.out.println(result);

        return result;
    }
    public static String NotAcalc(String[] input){
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
 }
