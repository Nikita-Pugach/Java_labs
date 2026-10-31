package com.lab;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Задание 1 ---");
        task1();
        System.out.println("\n--- Задание 2 ---");
        task2();
        System.out.println("\n--- Задание 3 ---");
        task3();
        System.out.println("\n--- Задание 4 ---");
        task4();
        System.out.println("\n--- Задание 5 ---");
        task5();
    }

    // Задание 1. Файл с информацией о песне
    public static void task1() {
        File file = new File("song.txt");

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("Название: Bohemian Rhapsody");
            writer.println("Исполнитель: Queen");
            writer.println("Год выпуска: 1975");
            writer.println("Альбом: A Night at the Opera");
        } catch (Exception e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер в байтах: " + file.length());
        System.out.println("Файл существует: " + file.exists());

        System.out.println("Содержимое файла:");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }

    // Задание 2. Ввести 10 чисел, найти количество степеней двойки
    public static void task2() {
        File file = new File("f.txt");
        Scanner console = new Scanner(System.in);

        System.out.println("Введите 10 целых чисел:");
        try (PrintWriter writer = new PrintWriter(file)) {
            for (int i = 0; i < 10; i++) {
                writer.println(console.nextInt());
            }
        } catch (Exception e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int count = 0;
        System.out.print("Числа из файла: ");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.print(num + " ");
                if (num > 0 && (num & (num - 1)) == 0) {
                    count++;
                }
            }
            System.out.println("\nКоличество степеней двойки: " + count);
        } catch (Exception e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }

    // Задание 3. Сумма цифр четна
    public static void task3() {
        File f = new File("f3.txt");
        File g = new File("g.txt");
        File h = new File("h.txt");
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(f)) {
            for (int i = 0; i < 10; i++) {
                writer.println(random.nextInt(1000) - 500);
            }
        } catch (Exception e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        try (Scanner scanner = new Scanner(f);
             PrintWriter writerG = new PrintWriter(g);
             PrintWriter writerH = new PrintWriter(h)) {

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                int temp = Math.abs(num);
                int sum = 0;

                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }

                if (sum % 2 == 0) {
                    writerG.println(num);
                } else {
                    writerH.println(num);
                }
            }
            System.out.println("Файлы g.txt и h.txt успешно созданы.");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // Задание 4. Средний угол
    public static void task4() {
        File file = new File("angles.txt");
        Scanner console = new Scanner(System.in);

        System.out.println("Введите 10 углов в градусах:");
        try (PrintWriter writer = new PrintWriter(file)) {
            for (int i = 0; i < 10; i++) {
                writer.println(console.nextDouble());
            }
        } catch (Exception e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        double sum = 0;
        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
                count++;
            }
            if (count > 0) {
                System.out.println("Средний угол: " + (sum / count));
            }
        } catch (Exception e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }

    // Задание 5. Количество чисел меньше нуля
    public static void task5() {
        File file = new File("f5.txt");
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(file)) {
            for (int i = 0; i < 10; i++) {
                writer.println(random.nextInt(100) - 50);
            }
        } catch (Exception e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                if (scanner.nextInt() < 0) {
                    count++;
                }
            }
            System.out.println("Количество чисел меньше нуля: " + count);
        } catch (Exception e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}