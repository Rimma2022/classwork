import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Tasks_1 {

    static void t12 () {
        double arr [] = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  (Math.random() * 10);
            System.out.println(arr[i]);
        }
        double sum = 0;
        double result;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("Сумма всех элементов: " + sum);
        result = sum/10;
        System.out.println("Cреднее арифметическое массива: " + result);

    }

    static void t13 () {
        char x = 'F';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра началась!");
        System.out.println("Введите букву от A - Z!");
        String txt = scanner.next();
    }



    public static void main(String[] args)  {

        t12();
        t13();




    }


}
