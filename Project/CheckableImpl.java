package Project;

public class CheckableImpl implements Checkable {
    @Override
    public boolean myTester(String value) {
        System.out.println("Calling Checkable");
        return value.contains("zajavka");
    }
}
