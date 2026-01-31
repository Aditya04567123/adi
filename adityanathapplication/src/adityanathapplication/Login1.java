package adityanathapplication;
class Login1 {
    static void authenticate(String user, String pass) {
        if (!user.equals("admin") || !pass.equals("1234")) {
            throw new IllegalArgumentException("Invalid Login");
        }
        System.out.println("Login Successful");
    }
    public static void main(String[] args) {
        try {
            authenticate("user", "1111");   // incorrect credentials
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Login Attempt Completed");
        }
    }
}

