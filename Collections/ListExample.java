package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
//        List<String> list = List.of("Tarczyn, Warszawa, Polska", "Wrocław, Polska", "Kraków, Polska");
//        for (String s : list) {
//            System.out.println(s);

        List<String> stringList = new ArrayList<>();
//        stringList.add("Budzik");
//        stringList.add("Tomasz");
//        stringList.add("Tatar");
//        stringList.add("Dąb");
//
//        System.out.println(stringList.size());
        for (int i = 0; i <20; i++) {
            stringList.add("string" + i);

        }
        System.out.println(stringList);
        }


    }

