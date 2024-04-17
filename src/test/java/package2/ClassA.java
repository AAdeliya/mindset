package package2;

public class ClassA {
    public void publicMethod(){
        System.out.println("This is the public methos of classA");
        privateMethod();
    }
    private void privateMethod(){
        System.out.println("This is the private methos of classB");


    }
    protected void protectedMethos(){
        System.out.println("This is the protected  method of class A");
    }
    
}
