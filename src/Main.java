import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Четное или нечетное число
        System.out.println("Введите число для проверки на четность:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

        // Задача 2: Минимальное из трех чисел
        System.out.println("Введите три числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = Math.min(Math.min(a, b), c);
        System.out.println("Минимальное число: " + min);

        // Задача 3: Таблица умножения
        System.out.println("Таблица умножения на 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // Задача 4: Сумма чисел от 1 до N
        System.out.println("Введите число N для суммы чисел от 1 до N:");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + N + " = " + sum);

        // Задача 5: Число Фибоначчи
        System.out.println("Введите число N для чисел Фибоначчи:");
        N = scanner.nextInt();
        int[] fib = new int[N];
        fib[0] = 0;
        if (N > 1) {
            fib[1] = 1;
        }
        for (int i = 2; i < N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.print("Первые " + N + " чисел Фибоначчи: ");
        for (int i = 0; i < N; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();

        // Задача 6: Проверка простого числа
        System.out.println("Введите число для проверки на простоту:");
        number = scanner.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("Число " + number + (isPrime ? " простое" : " не является простым"));

        // Задача 7: Обратный порядок чисел
        System.out.println("Введите число N для вывода чисел от N до 1:");
        N = scanner.nextInt();
        System.out.print("Числа от " + N + " до 1: ");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 8: Сумма четных чисел
        System.out.println("Введите два числа A и B для нахождения суммы четных чисел:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        sum = 0;
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма четных чисел от " + A + " до " + B + " = " + sum);

        // Задача 9: Реверс строки
        System.out.println("Введите строку для реверса:");
        scanner.nextLine();  // Очистка буфера после ввода числа
        String str = scanner.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Реверс строки: " + reversedStr);

        // Задача 10: Количество цифр в числе
        System.out.println("Введите число для подсчета цифр:");
        number = scanner.nextInt();
        int digitCount = String.valueOf(Math.abs(number)).length();
        System.out.println("Количество цифр в числе: " + digitCount);
        // Задача 11: Факториал числа
        System.out.println("Введите число N для вычисления факториала:");
        N = scanner.nextInt();
        long factorial = 1;
        for (int i = 2; i <= N; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + N + " = " + factorial);

        // Задача 12: Сумма цифр числа
        System.out.println("Введите число для нахождения суммы его цифр:");
        number = scanner.nextInt();
        sum = 0;
        while (number != 0) {
            sum += Math.abs(number % 10);
            number /= 10;
        }
        System.out.println("Сумма цифр числа = " + sum);

        // Задача 13: Палиндром
        System.out.println("Введите строку для проверки на палиндром:");
        str = scanner.nextLine();
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        String reversedCleanedStr = new StringBuilder(cleanedStr).reverse().toString();
        boolean isPalindrome = cleanedStr.equals(reversedCleanedStr);
        System.out.println("Строка " + (isPalindrome ? "является палиндромом" : "не является палиндромом"));

        // Задача 14: Найти максимальное число в массиве
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число в массиве: " + max);

        // Задача 15: Сумма всех элементов массива
        sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println("Сумма всех элементов массива: " + sum);

        // Задача 16: Количество положительных и отрицательных чисел
        int positiveCount = 0;
        int negativeCount = 0;
        for (int value : array) {
            if (value > 0) {
                positiveCount++;
            } else if (value < 0) {
                negativeCount++;
            }
        }
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);

        // Задача 17: Простые числа в диапазоне
        System.out.println("Введите два числа A и B для поиска простых чисел в диапазоне:");
        A = scanner.nextInt();
        B = scanner.nextInt();
        System.out.println("Простые числа в диапазоне от " + A + " до " + B + ":");
        for (int i = A; i <= B; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Задача 18: Подсчет гласных и согласных в строке
        System.out.println("Введите строку для подсчета гласных и согласных:");
        str = scanner.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Количество гласных: " + vowelCount);
        System.out.println("Количество согласных: " + consonantCount);

        // Задача 19: Перестановка слов в строке
        System.out.println("Введите строку, состоящую из нескольких слов:");
        str = scanner.nextLine();
        String[] words = str.split("\\s+");
        StringBuilder reversedWords = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords.append(words[i]).append(" ");
        }
        System.out.println("Слова в обратном порядке: " + reversedWords.toString().trim());
        // Задача 20: Число Армстронга
        System.out.println("Введите число для проверки на число Армстронга:");
        number = scanner.nextInt();
        int originalNumber = number;
        int numDigits = String.valueOf(Math.abs(number)).length();
        sum = 0;
        while (number != 0) {
            sum += Math.pow(number % 10, numDigits);
            number /= 10;
        }
        System.out.println("Число " + originalNumber + (sum == originalNumber ? " является числом Армстронга" : " не является числом Армстронга"));
    }


    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}