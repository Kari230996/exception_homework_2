import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("Введенное число: " + number);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float number = 0.0f;
        boolean validInput = false;

        do {
            System.out.print("Введите дробное число: ");
            if (scanner.hasNextFloat()) {
                number = scanner.nextFloat();
                validInput = true;
            } else {
                System.out.println("Ошибка ввода. Повторите попытку.");
                scanner.nextLine(); // Очистка буфера ввода
            }
        } while (!validInput);

        return number;
    }
}
