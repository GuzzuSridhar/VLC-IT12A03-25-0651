package abstraction.functionalinterface.Generics;

@FunctionalInterface
// anything written in Java within the angled bracket <> is generics
public interface Operation<T> {
    T calculate(T x, T y);
}
