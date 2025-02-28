package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> stringList = List.of("A", "B", "C");
        List<String> result = stringList.stream()
                .peek(value -> System.out.println("Peeked value: " + value))
                .collect(Collectors.toList());

    }
}
