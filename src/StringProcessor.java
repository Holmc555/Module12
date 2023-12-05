import java.util.List;
import java.util.stream.Collectors;

public class StringProcessor {
    public static List<String> processStrings(List<String> inputStrings) {
        return inputStrings.stream()
                .map(String::toUpperCase) // перетворення в верхній регістр
                .sorted((s1, s2) -> s2.compareTo(s1)) // сортування за спаданням
                .collect(Collectors.toList()); // збір результату в список
    }

    public static void main(String[] args) {
        List<String> inputNames = List.of("Ivan", "Maria", "Peter", "Anna");
        List<String> result = processStrings(inputNames);
        System.out.println(result);
    }
}
