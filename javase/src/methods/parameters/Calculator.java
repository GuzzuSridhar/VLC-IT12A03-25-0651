package methods.parameters;

public class Calculator {
    // instance methods
    static float add(float f, float g) {
        return f + g;
    }

    // overload rules
    // 1. same method name
    // 2 different numbers of parameters
    // 3. different types of parameters
    // 4. different order of parameters
    // 5. return type is irrelevant
    // 6. access modifiers are relevant
    static float add(float f, float g, float h) {
        return f + g + h;
    }

    static float add(float f, float g, float h, float i) {
        return f + g + h + i;
    }

    // unlimited parameters
    static float add(float... f) {
        float sum = 0;
        for (int i = 0; i < f.length; i++) {
            sum += f[i];
        }
        return sum;
    }

    static float sub(float f, float g) {
        return f - g;
    }

}
