import java.util.Scanner;
import java.util.InputMismatchException;


public class Calc {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);

        System.out.println("Для калькулятора с арабскими цифрами напишите =======> \'A\' \nДля калькулятора с римскими цифрами напишите =======> \'R\'");
        char rim ;
        if(scan.hasNext()) {
            rim = scan.next().charAt(0);
            if(rim == 'R'){
                rim rim1 = new rim();
                rim1.rimNum();
            }else{
                int num1 = getNum1();
                int num2 = getNum2();
                char action = operation();
                int result = solution(num1, num2, action);
                System.out.print("Ваш результат " + result);
            }

        }



    }


    public static int getNum1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Напишите первую цифру: ");
        int num;
        if(scan.hasNext()) {
            num=scan.nextInt();
        }else {
            System.out.println("Вы ввели неправильное действие");
            scan.nextInt();
            num=getNum1();
        }
        return num;
    }
    public static int getNum2(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Напишите вторую цифру: ");
        int num;
        if(scan.hasNext()) {
        num=scan.nextInt();
        }else {
            System.out.println("Вы ввели неправильное действие");
            scan.nextInt();
            num=getNum2();
        }
        return num;
    }
    public static char operation(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Напишите действие: \" + \"  \" - \"  \" * \"  \" / \" ");
        char symbol;
        if(scan.hasNext()){
            symbol = scan.next().charAt(0);
        } else {
            System.out.println("Вы ввели неправильное действие");
            scan.next();
            symbol = operation();
        }
        return symbol;
    }
    public static int solution(int num1, int num2, char action){
        int result;

        switch (action){
            case '+':
               result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неправильно. Повторите ввод.");
                result = solution(num1, num2, operation());

        }
        return result;
    }

}
