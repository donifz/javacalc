import java.util.Scanner;

public class rim extends Calc {
    public static void rimNum()

    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Подсказка: Убедитесь, что CapsLock включен, римские цифры это - I, II, III IV, V...X и тд. ");
        System.out.print("Напишите первую римскую цифру: ");
        String value1 = scan.nextLine();
        System.out.print("Напишите первую римскую цифру: ");
        String value2 = scan.nextLine();
        int strToInt = toArabic(value1);
        int strToInt2 = toArabic(value2);
        char action = operation();
        int result = solution(strToInt, strToInt2, action);
//        int sum = strToInt + strToInt2;
        String rom = toString(result);
        System.out.println("Ваш результат " + rom);

    }

    public static int toArabic(String value) {
        int num = 0;
        switch (value) {
            case "I":
                num = 1;
                break;
            case "II":
                num = 2;
                break;
            case "III":
                num = 3;
                break;
            case "IV":
                num = 4;
                break;
            case "V":
                num = 5;
                break;
            case "VI":
                num = 6;
                break;
            case "VII":
                num = 7;
                break;
            case "VIII":
                num = 8;
                break;
            case "IX":
                num = 9;
                break;
            case "X":
                num = 10;
                break;
            default:
                System.out.println("Вы ввели неверную Римскую цифру или убедитесь что Capslock включена ");

                break;
        }
        return num;


    }
    public static String toString(int value){
        String num = "";
        switch (value) {
            case 1:
                num = "I";
                break;
            case 2:
                num = "II";
                break;
            case 3:
                num = "III";
                break;
            case 4:
                num = "IV";
                break;
            case 5:
                num = "V";
                break;
            case 6:
                num = "VI";
                break;
            case 7:
                num = "VII";
                break;
            case 8:
                num = "VIII";
                break;
            case 9:
                num = "IX";
                break;
            case 10 :
                num = "X";
                break;
            case 11 :
                num = "XI";
                break;
            case 12 :
                num = "XII";
                break;
            case 13 :
                num = "XIII";
                break;
            case 14 :
                num = "XIV";
                break;
            case 15 :
                num = "XV";
                break;
            case 16 :
                num = "XVI";
                break;
            case 17 :
                num = "XVII";
                break;
            case 18 :
                num = "XVIII";
                break;
            default:
                System.out.println("Произошла ошибка при конвертировании Арабских цифр на Римские");

                break;
        }
        return num;
    }

}
