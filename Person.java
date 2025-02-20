public class Person {
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Boba", 20);
        person1.sayHello();
    }
}
