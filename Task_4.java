import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        try {
            String input = readInputFromUser();
            System.out.println("Введенная строка: " + input);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String readInputFromUser() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя");
        }

        return input;
    }
}
