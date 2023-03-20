class Exercise7_20 {
    public static void main(String[] args) {
        Parent p = new Child();  //p.x 조상타입 참조변수
        Child c = new Child();   //c.x 자손타입 참조변수
        System.out.println("p.x = " + p.x); // 100  조상타입의 참조변수로 자손 인스턴스를 참조하는ㄱ경우
        p.method(); // Child
        System.out.println("c.x = " + c.x);  // 200 자손타입 참조변수로 자손 인스턴스를 참조하는 경우
        c.method();  // Child
    }
}
class Parent {
    int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}
class Child extends Parent {
    int x = 200;
    void method() {
        System.out.println("Child Method");
    }
}
