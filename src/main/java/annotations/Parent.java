package annotations;

public class Parent {
    public void someMethod() {
        System.out.println("Some method from parent class");
    }

    @Deprecated
    public void otherMethod() {
        System.out.println("Some other method from parent class");
    }
}
