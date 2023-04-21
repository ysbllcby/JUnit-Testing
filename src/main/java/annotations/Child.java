package annotations;

public class Child extends Parent {

    @Override
    public void someMethod() {
        System.out.println("Overridding method from parent class");
    }
}
