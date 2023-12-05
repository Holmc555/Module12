import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NameProcessor {
    public static String filterNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> inputNames = List.of("Ivan", "Maria", "Peter", "Anna");
        String result = filterNames(inputNames);
        System.out.println(result);
    }
}
