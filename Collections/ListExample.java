package Collections;

import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> list = List.of("Tarczyn, Warszawa, Polska", "Wrocław, Polska", "Kraków, Polska");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
