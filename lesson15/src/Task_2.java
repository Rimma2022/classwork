import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        String number = reader.readLine();

        if (number == null || number.isEmpty()) {
            throw new IllegalArgumentException("Введите число: ");
        }
        int userNumberInt;
        try {
            userNumberInt = Integer.parseInt(number);
            if (userNumberInt > 999 || userNumberInt <1) {
                throw new IllegalArgumentException("Не из диапозона");
            }
            printNumberType(userNumberInt);

        } catch (NumberFormatException ex) {
            try {
                double userNumberDouble = Double.parseDouble(number);
                System.out.println("введено нецелое число!");
            } catch (NumberFormatException e){
                System.out.println("Введена строка!");
            }

        }

    }
    private static void printNumberType (int userNumberInt) {
        if (userNumberInt < 10) {
            System.out.println("число однозначное");
        } else if (userNumberInt < 100 && userNumberInt >= 10) {
            System.out.println("число двузначное");
        } else {
            System.out.println("число трехзначное");
        }
        if (userNumberInt % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }

    }


}
