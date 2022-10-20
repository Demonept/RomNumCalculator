import java.io.IOException;

public class Filter {
    public static String filter(String input)throws IOException{
        String[] spl = input.split(" ");
        String left = spl[0];
        String right = spl[2];
        String oper = spl[1];
        if(spl.length > 3){
            throw new IOException();
        }else if(spl.length < 3) {
            throw new IOException();
        }
        if(isRom(left) && isRom(right)){
            spl[0] = ConvertRom.RomToAr(left);
            spl[2] = ConvertRom.RomToAr(right);
            String result = Main.calc(spl);
            int res = Integer.parseInt(result);
            String last = ConvertRom.ArToRom(res);
            System.out.println(last);
            return last;
        }
        if(isRom(left) != isRom(right)){
            throw new IOException();
        }
        if(isTen(spl) != true){
            throw new IOException();
        }
        String result = Main.calc(spl);
        System.out.println(result);

        return result;
    }

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
    private static boolean isTen(String[] b){
        int a = Integer.parseInt(b[0]);
        int c = Integer.parseInt(b[2]);
        if(1 < a && a <= 10 ){
            return true;
        }
        if(1 < c && c <= 10 ){
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