class Person {
    Person() {
        System.out.println("Person constructor called");
    }
}

class Employee extends Person {
    Employee() {
        super(); // calls Person's constructor
        System.out.println("Employee constructor called");
    }
}

class Manager extends Employee {
    Manager() {
        super(); // calls Employee's constructor
        System.out.println("Manager constructor called");
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Manager m = new Manager(); 
    }
}
