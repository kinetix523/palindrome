import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] text = {"а роза упала на лапу Азора", "1991", "Don't nod", "No lemon, no melon", "Do it, Tido", "12512", "112121"};

        for (int i = 0; i < text.length; i++) {
            char[] array = text[i].replaceAll("[^a-zA-Zа-яА-Я0-9]+","").toLowerCase().toCharArray();
            System.out.print(text[i]);
            checkPalindrome(array);
            System.out.println();
        }

        System.out.println("\n" + "Введите свой текст для проверки (выход из программы - стоп): ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        while (!word.equals("стоп")) {
            char[] array = word.replaceAll("[^a-zA-Zа-яА-Я0-9]+", "").toLowerCase().toCharArray();
            System.out.print(word);
            checkPalindrome(array);
            System.out.println();
            word = scanner.nextLine();
        }
    }

    static void checkPalindrome(char[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] == array[right]) {
                left = left + 1;
                right = right - 1;
            } else {
                System.out.print(" - не палиндром");
                return;
            }
        }
        System.out.print(" - палиндром");;
    }
}
