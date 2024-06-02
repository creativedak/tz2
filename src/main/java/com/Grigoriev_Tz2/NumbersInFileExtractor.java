package com.Grigoriev_Tz2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumbersInFileExtractor {

    public static void main(String[] args) {
        try {
            List<Integer> numbers = readNumbersFromFile("test.txt");
            System.out.println("Минимальное число в файле: " + getMinimum(numbers));
            System.out.println("Максимальное число в файле: " + getMaximum(numbers));
            System.out.println("Сумма чисел в файле: " + getSumm(numbers));
            System.out.println("Произведение чисел в файле: " + getMultiplication(numbers));
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public static List<Integer> readNumbersFromFile(String fileName) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            if (line != null) {
                String[] parts = line.split(" ");
                for (String part : parts) {
                    numbers.add(Integer.parseInt(part));
                }
            }
        }
        return numbers;
    }

    public static int getMinimum(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int getMaximum(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static long getSumm(List<Integer> numbers) {
        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static long getMultiplication(List<Integer> numbers) {
        long mult = 1;
        for (int number : numbers) {
            mult *= number;
        }
        return mult;
    }
}
