package adityanathapplication;

class Result {
    static void checkMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Invalid Marks");
        }
        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    public static void main(String[] args) {
        try {
            checkMarks(130);   
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


