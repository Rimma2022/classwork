import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leson15 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи возраст ");
        String ageString = reader.readLine();
        Integer age;
//        if (ageString != null && !ageString.isEmpty() ) {
//            age = Integer.parseInt(ageString);
//        }
//        String age = reader.readLine();
//        Integer age = new Integer(reader.readLine());
//        Integer age = Integer.parseInt(reader.readLine());
        try {
            age = Integer.parseInt(ageString);
        } catch (NumberFormatException ex) {
            throw new Exception("Возраст пуст!");
//            System.out.println("Возраст пуст!");
        }


        int x = 0;
        int mass [] = {1, 2, 3};
        try {
//            Cat cat = null;
//            cat.toString().charAt(3);
            mass[5]++;
            System.out.println(10/x);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Любо деление на 0, либо арифметическая ошибка  " + ex);
        } catch (Exception ex) {
            System.err.println("какая-то ошибка");
        } finally {

        }




    }
}
