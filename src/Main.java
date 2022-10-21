import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите математическое выражение: ");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = calc(a);
        }

    public static String calc(String input)throws IOException{
        String c = input.toUpperCase();//Перевод строки в верхний регистр
        String[] spl = c.split(" ");//Разделение строки по пробелу
        String left = spl[0];
        String right = spl[2];
        String oper = spl[1];
        if(spl.length > 3){//Проверка массива строк на количество эллементов
            throw new IOException();
        }else if(spl.length < 3) {//Вторая роверка массива строк на количество эллементов
            throw new IOException();
        }
        if(Filter.isRom(left) && Filter.isRom(right)){//Проверка на наличие римских цифр
            spl[0] = ConvertRom.RomToAr(left);//Перевод на арабские
            spl[2] = ConvertRom.RomToAr(right);//Перевод на арабские
            String result = Main.NotAСalc(spl);//Подсчет в НЕкалькуляторе
            int res = Integer.parseInt(result);//Подсчет в НЕкалькуляторе
            String last = ConvertRom.ArToRom(res);//Перевод в римские цифры
            System.out.println(last);//Вывод результата
            return last;//Завершение
        }
        if(Filter.isRom(left) != Filter.isRom(right)){
            throw new IOException();//Выражение не подходит условиям
        }
        if(Filter.isTen(spl) != true){
            throw new IOException();//Выражение не подходит условиям
        }
        String result = Main.NotAСalc(spl);//Подсчет в НЕкалькуляторе арабских цифр
        System.out.println(result);//Вывод результата

        return result;//Завершение
    }
    public static String NotAСalc(String[] input){
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
