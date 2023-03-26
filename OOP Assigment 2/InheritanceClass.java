public class InheritanceClass {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        base.method1();

        SubClass sub = new SubClass();
        sub.method1();
    }
}

class BaseClass {
    public void method1() {
        System.out.println("Calling method2 from BaseClass");
        BaseClass obj=new BaseClass();
        obj.method2();
    }

    public void method2() {
        System.out.println("BaseClass method2");
    }
}

class SubClass extends BaseClass {
    @Override
    public void method2() {
        System.out.println("SubClass method2");
    }
}

