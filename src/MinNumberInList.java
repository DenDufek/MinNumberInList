import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MinNumberInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Крок 1: Введення числа N
        System.out.println("Введіть число N:");
        int N = scanner.nextInt();

        // Крок 2: Отримання списку цілих чисел
        List<Integer> integerList = getIntegerList(N);

        // Крок 3: Знаходження мінімального числа
        int minNumber = getMinimum(integerList);

        // Виведення результату
        System.out.println("Мінімальне число у списку: " + minNumber);
    }

    // Метод для отримання списку цілих чисел
    private static List<Integer> getIntegerList(int N) {
        List<Integer> integerList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть " + N + " цілих чисел:");
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            integerList.add(number);
        }

        return integerList;
    }

    // Метод для знаходження мінімального числа в списку
    private static int getMinimum(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Список порожній");
        }

        int min = list.get(0);
        for (int number : list) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }
}
