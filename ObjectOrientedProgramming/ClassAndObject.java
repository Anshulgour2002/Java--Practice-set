public class ClassAndObject {

    // Class Variables (Properties)
    String name;
    int age;

    // Method
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {

        // Object Creation
        ClassAndObject obj1 = new ClassAndObject();

        // Assign Values
        obj1.name = "Anshul";
        obj1.age = 22;

        // Call Method
        obj1.display();
    }
}