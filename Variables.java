public class Variables {
    // Instance variable
    private int instanceVar;

    // Static variable
    private static int staticVar;

    public void instanceVariableExample() {
        // Local variable
        int localVar = 10;

        System.out.println("Instance Variable: " + instanceVar); // Instance variable accessed
        System.out.println("Static Variable: " + staticVar);     // Static variable accessed
        System.out.println("Local Variable: " + localVar);       // Local variable accessed
    }

    public static void main(String[] args) {
        Variables demo1 = new Variables();
        demo1.instanceVar = 5;     // Assign a value to instance variable
        Variables.staticVar = 7; // Assign a value to static variable

        demo1.instanceVariableExample(); // Call instanceVariableExample() using the instance

        Variables demo2 = new Variables();
        demo2.instanceVar = 15;    // Assign a value to instance variable
        Variables.staticVar = 17; // Assign a value to static variable

        demo2.instanceVariableExample(); // Call instanceVariableExample() using the instance
    }
}

