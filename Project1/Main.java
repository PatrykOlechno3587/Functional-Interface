package Project1;

public class Main {

    public static void main(String[] args) {

        SomeFunctionalInterface impl = (arg1) -> {
          System.out.println("Calling our functional interface: " + arg1);
          };
        impl.consume("myArg1 "  );
    }


}
