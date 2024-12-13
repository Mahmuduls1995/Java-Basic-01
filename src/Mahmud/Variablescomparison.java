package Mahmud;


class VariableTypes {
    int instanceVar = 10; // Instance variable
    static int staticVar = 20; // Static variable

    public void demonstrateVariables() {
        int localVar = 30; // Local variable
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();
        obj.demonstrateVariables();

        // Access static variable directly
        System.out.println("Access Static Variable: " + VariableTypes.staticVar);
    }
}
