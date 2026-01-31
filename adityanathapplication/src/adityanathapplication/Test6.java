package adityanath;

class Test6 {

    public static void main(String[] args) {

        try {
            int x = 13, y = 0, z;
            z = x / y;   
            System.out.println(z);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("end");
    }
}
