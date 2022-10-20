import java.io.IOException;

public class ConvertRom {
    public static String ArToRom(int numAr) throws IOException{
        String[] Roman = {"Z", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
                "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        if(numAr < 1){
            throw new IOException();
        }
        final String s = Roman[numAr];
        return s;
    }
    public static String RomToAr(String arg){
        String[] q = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] w = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String Num = "";
        for(int i = 0; i <= w.length -1; i++){
            if(arg.equals(w[i])){
                Num = q[i];
            }
        }
        return Num;
    }


    }
