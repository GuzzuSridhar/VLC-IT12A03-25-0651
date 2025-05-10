package abstraction.functionalinterface;

// functional interface
// has only one abstract method
// to verify use the @FunctionalInterface

@FunctionalInterface
public interface Operation {
    int calculate(int x, int y);
}
