package com.Grigoriev_Tz2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersInFileExtractorTest {

    @Test
    public void testMin() {
        List<Integer> numbers = List.of(1, 4, 2, 3);
        assertEquals(1, NumbersInFileExtractor.getMinimum(numbers));
    }

    @Test
    public void testMax() {
        List<Integer> numbers = List.of(1, 4, 2, 3);
        assertEquals(4, NumbersInFileExtractor.getMaximum(numbers));
    }

    @Test
    public void testSum() {
        List<Integer> numbers = List.of(1, 4, 2, 3);
        assertEquals(10, NumbersInFileExtractor.getSumm(numbers));
    }

    @Test
    public void testMult() {
        List<Integer> numbers = List.of(1, 4, 2, 3);
        assertEquals(24, NumbersInFileExtractor.getMultiplication(numbers));
    }

    @Test
    public void testPerformance() {
        int[] sizes = {1000, 10000, 100000, 1000000};
        for (int size : sizes) {
            List<Integer> numbers = generateRandomNumbers(size);
            long startTime = System.currentTimeMillis();
            NumbersInFileExtractor.getMinimum(numbers);
            NumbersInFileExtractor.getMaximum(numbers);
            NumbersInFileExtractor.getSumm(numbers);
            NumbersInFileExtractor.getMultiplication(numbers);
            long endTime = System.currentTimeMillis();
            System.out.println("Размер: " + size + ", Время выполнения: " + (endTime - startTime) + " мс");
        }
    }

    @Test
    public void testPerformanceMin() {
        int[] sizes = {1000, 10000, 100000, 1000000};
        for (int size : sizes) {
            List<Integer> numbers = generateRandomNumbers(size);
            long startTime = System.currentTimeMillis();
            NumbersInFileExtractor.getMinimum(numbers);
            long endTime = System.currentTimeMillis();
            System.out.println("Размер: " + size + ", Время выполнения: " + (endTime - startTime) + " мс");
        }
    }

    @Test
    public void testPerformanceMax() {
        int[] sizes = {1000, 10000, 100000, 1000000};
        for (int size : sizes) {
            List<Integer> numbers = generateRandomNumbers(size);
            long startTime = System.currentTimeMillis();
            NumbersInFileExtractor.getMaximum(numbers);
            long endTime = System.currentTimeMillis();
            System.out.println("Размер: " + size + ", Время выполнения: " + (endTime - startTime) + " мс");
        }
    }

    @Test
    public void testPerformanceSum() {
        int[] sizes = {1000, 10000, 100000, 1000000};
        for (int size : sizes) {
            List<Integer> numbers = generateRandomNumbers(size);
            long startTime = System.currentTimeMillis();
            NumbersInFileExtractor.getSumm(numbers);
            long endTime = System.currentTimeMillis();
            System.out.println("Размер: " + size + ", Время выполнения: " + (endTime - startTime) + " мс");
        }
    }

    @Test
    public void testPerformanceMult() {
        int[] sizes = {1000, 10000, 100000, 1000000};
        for (int size : sizes) {
            List<Integer> numbers = generateRandomNumbers(size);
            long startTime = System.currentTimeMillis();
            NumbersInFileExtractor.getMultiplication(numbers);
            long endTime = System.currentTimeMillis();
            System.out.println("Размер: " + size + ", Время выполнения: " + (endTime - startTime) + " мс");
        }
    }


    private List<Integer> generateRandomNumbers(int size) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(1000) + 1);
        }
        return numbers;
    }
}
