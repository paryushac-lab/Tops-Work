abstract class Parent {
    // Abstract method
    abstract void message();
}

// First subclass
class FirstSubclass extends Parent {
    void message() {
        System.out.println("This is first subclass");
    }
}

// Second subclass
class SecondSubclass extends Parent {
    void message() {
        System.out.println("This is second subclass");
    }
}

// Main class
public class AbstractParentMethod_assi {
    public static void main(String[] args) {

        FirstSubclass obj1 = new FirstSubclass();
        SecondSubclass obj2 = new SecondSubclass();

        obj1.message();
        obj2.message();
    }
}
