package com.teachmeskills.homework;
/*
Задача * : Программа на вход получает произвольный текст.
В этом тексте может быть номер документа(один или несколько), емейл и номер телефона.
Номер документа в формате: xxxx-xxxx- xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx.
Документ может содержать не всю информацию, т.е. например, может не содержать номер телефона, или другое.
Необходимо найти эту информацию и вывести в консоль в формате : email: teachmeskills@gmail.com document number: 1423-1512-51 и т.д
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine();

        // Поиск емейла + проверка корректности ввода
        Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b");
        Matcher emailMatcher = emailPattern.matcher(input);
        if (emailMatcher.find()) {
            String email = emailMatcher.group();
            System.out.println("email: " + email);
        } else {
            System.out.println("Некорректный ввод для email");
        }

        // Поиск номера документа + проверка корректности ввода
        Pattern documentPattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
        Matcher documentMatcher = documentPattern.matcher(input);
        if (documentMatcher.find()) {
            String documentNumber = documentMatcher.group();
            System.out.println("document number: " + documentNumber);
        } else {
            System.out.println("Некорректный ввод для номера документа");
        }

        // Поиск номера телефона + проверка корректности ввода
        Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        Matcher phoneMatcher = phonePattern.matcher(input);
        if (phoneMatcher.find()) {
            String phoneNumber = phoneMatcher.group();
            System.out.println("phone number: " + phoneNumber);
        } else {
            System.out.println("Некорректный ввод для номера телефона");
        }
    }
}
