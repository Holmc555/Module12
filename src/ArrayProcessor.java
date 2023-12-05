import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayProcessor {
    public static String processArray(String[] inputArray) {
        return Arrays.stream(inputArray)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .distinct()
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        String result = processArray(inputArray);
        System.out.println(result);
    }
}
