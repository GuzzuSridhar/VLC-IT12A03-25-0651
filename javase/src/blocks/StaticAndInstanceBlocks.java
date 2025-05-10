package blocks;

public class StaticAndInstanceBlocks {

    // instance block
    // executed every timne an instance is created
    {
        System.out.println("Instance block accessed");
    }

    // static block
    // executed once when the class is loaded on to the memory
    static {
        System.out.println("Static block executed");
    }

}
