import java.util.Arrays;
import java.util.Collections;

    public class Algoritm {
        public static void main(String[] args) {
            Integer[] numbers = {40, 250, 80, 88, 240, 12, 148};
            int min = (int) Collections.min(Arrays.asList(numbers));
            int max = (int) Collections.max(Arrays.asList(numbers));

            System.out.println("Минимальное число: " + min);
            System.out.println("Максимальное число: " + max);
        }
    }
