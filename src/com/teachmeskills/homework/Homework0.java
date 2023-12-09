package com.teachmeskills.homework;
/*
Задача 1 : Вывести в консоль из строки которую пользователь вводит с клавиатуры все аббревиатуры.
Аббревиатурой будем считать слово от 2 до 6 символов, состоящее только из прописных букв, без чисел
 */
import java.util.Scanner;

public class Homework0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something:");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        for (String word : words) {
            if (word.matches("[A-Z]{2,6}")) {
                System.out.println(word);
            }
        }
    }
}
