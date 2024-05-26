import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberProcessorTest {

    @Test
    public void testMin() {
        int[] numbers = {1, 4, 2, 3};
        assertEquals(1, NumberProcessor._min(numbers));
    }

    @Test
    public void testMax() {
        int[] numbers = {1, 4, 2, 3};
        assertEquals(4, NumberProcessor._max(numbers));
    }

    @Test
    public void testSum() {
        int[] numbers = {1, 4, 2, 3};
        assertEquals(10, NumberProcessor._sum(numbers));
    }

    @Test
    public void testMult() {
        int[] numbers = {1, 4, 2, 3};
        assertEquals(24, NumberProcessor._mult(numbers));
    }

    @Test
    public void testPerformance() throws IOException {
        int[] sizes = {1000, 10000, 100000, 1000000};
        for (int size : sizes) {
            int[] numbers = generateRandomNumbers(size);
            long startTime = System.currentTimeMillis();
            NumberProcessor._min(numbers);
            NumberProcessor._max(numbers);
            NumberProcessor._sum(numbers);
            NumberProcessor._mult(numbers);
            long endTime = System.currentTimeMillis();
            System.out.println("Размер: " + size + ", Время выполнения: " + (endTime - startTime) + " мс");
        }
    }

    private int[] generateRandomNumbers(int size) throws IOException {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(1000) + 1;
        }
        Files.write(Paths.get("numbers.txt"), Arrays.toString(numbers).getBytes());
        return numbers;
    }
}
