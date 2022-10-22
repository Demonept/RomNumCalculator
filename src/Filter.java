import java.io.IOException;

public class Filter {
    public static boolean isRom(String str){
        String[] st = str.split(" ");
        String[] w = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        for(int i = 0; i <= w.length - 1; i++){
            if(st[0].equals(w[i])) {
                return true;
            }
        }
        return false;
    }
    static boolean isTen(String[] b){
        int a = Integer.parseInt(b[0]);
        int c = Integer.parseInt(b[2]);
        int v = 0;
        if(1 < a && a <= 10 ){
            v++;
        }
        if (1 < c && c <= 10 ){
            v++;
        }
        if(v == 2){
            return true;
        }
        return false;
    }

}




//НЕ РАБОТАЕТ
//            if (input.charAt(i) == '+' ||
//                    input.charAt(i) == '-' ||
//                    input.charAt(i) == '/'||
//                    input.charAt(i) == '*')
//            {
//
//                String r = new String(String.valueOf(input.charAt(i)));
//                String[] t = input.split(r);
//                System.out.println(t);
//
//            }