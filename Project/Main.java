package Project;

public class Main {
    public static void main(String[] args) {
        Checkable checkable = (String value) -> {
            System.out.println("Calling Lambda");
            return  value.contains("Super");
        };

        System.out.println(checkable.myTester("Super"));

    }


}

