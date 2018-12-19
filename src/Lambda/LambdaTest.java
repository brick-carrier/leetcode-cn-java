package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LambdaTest {
        public static void main(String[] args) {
            // Java 8之后：
            List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
            features.forEach(n -> System.out.println(n));
        }

    private static boolean isPrime(int number) {
        return number > 1
                && IntStream.range(2, number).noneMatch(
                index -> number % index == 0);
    }
}
