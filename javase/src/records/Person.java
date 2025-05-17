package records;

// alternative to the encapsulated classes
public record Person(String name, int age) {

}

// Records implicitly generate
/*
 * Constructor
 * Accessor methods (not prefixed with get)
 * toString(), hashCode(), euqals() methods
 */