public class ClassAndObject2 {

    String name;
    int age;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println();
    
    }

    public static void main(String[] args) {

        ClassAndObject obj1 = new ClassAndObject();
        obj1.name = "Anshul";
        obj1.age = 22;

        ClassAndObject obj2 = new ClassAndObject();
        obj2.name = "Rahul";
        obj2.age = 25;

        obj1.display();
        obj2.display();

        // System.out.println(obj2.name);
       
    }
}