class Parent {
    Parent(String name, int a) {
        System.out.println("Parent parameterized constructor " + name + a);
    }

    Parent() {
        System.out.println("Parent constructor " );
    }

}

class Child extends Parent {
 Child() {
	 System.out.println("Child constructor ");

}
    Child(String name) {
        super("AmruthaNayak", 14);
        System.out.println("Child parameterized constructor " + name);
    }
}

class InheritanceDemo {

    public static void main(String... args) {
        Child c = new Child("Amru");
        //Parent p1 = new Child() ;
    }
}