public class super_ {
    int age=100;
    void f(){

        System.out.println("父亲的年纪是"+age);
    }
}

class child extends super_ {
    //int age;//后来加的
    void f() {
        super.f();
        System.out.println(super.age);
        this.age = 200;
        System.out.println("孩子的年纪是" + this.age);
        System.out.println(super.age);

    }

    public static void main(String[] args) {
        child child = new child();
        child.f();
    }
}