package adityanathapplication;

class Demo {
    static int a;
    static int b;

    static {
        a = 100;
        b = 200;
    }
    static void disp() {
        System.out.println(a);
        System.out.println(b);
    }
    int x;
    int y;

    {
        a = 100;
        b = 200;
        x = 300;
        y = 500;
    }

    void disp2() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
class Demopy {
    public static void main(String[] args) {
        Demo.disp();
        Demo d = new Demo();
        d.disp2();
    }
}

