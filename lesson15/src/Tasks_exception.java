import java.io.*;
public class Tasks_exception {
    public static void t1 () {
        int result;
        int size = (int) (1 + Math.random() * 9);
        int arr [] = new int[size];
//        System.out.println(size);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 21) - 10);
//            System.out.println(arr[i]);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        String number = null;
        try {
            number = reader.readLine();
        } catch (IOException ex) {
            System.out.println("Ошибка!");
        }

        int num = 0;
        try {
            num = Integer.parseInt(number);
        } catch (NumberFormatException ex) {
            System.out.println("Ничего не ввели или ввели не число!");
        }

        for (int i = 0; i < arr.length; i++) {
            try {
                result = num / arr[i];
                System.out.print(result + "; ");
            } catch (ArithmeticException ex) {
                System.out.print("В массиве оказался 0, на 0 делить нельзя");
            }


        }
    }

    public static void t2 (int a) throws IOException {
        if (a < 0) {
            throw new IllegalArgumentException ();
        } else if (a > 100) {
            throw new IOException(" ");
        }
        System.out.println("ghjkll;;");
    }






    public static void main(String[] args)  {
//        InputStream inputStream = System.in;
//        Reader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        t1();
        System.out.println();
        try {
            t2(10);
        } catch (IllegalArgumentException ex) {
            System.out.println("Введено отрицательное число");
        } catch (IOException ex) {

        }





    }

}
