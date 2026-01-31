package adityanathapplication;

import java.io.*;
import java.util.Scanner;

public class StudentRecordManagement {

    static final String FILE_NAME = "students.txt";

    // Method to write student data to file
    static void writeStudentRecord(int id, String name, int marks) {
        try {
            File file = new File(FILE_NAME);

            FileWriter fw = new FileWriter(file, true); // append mode
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(id + "," + name + "," + marks);
            bw.newLine();

            bw.close();
            fw.close();

            System.out.println("Student record saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        }
    }

    // Method to read student data from file
    static void readStudentRecords() {
        try {
            FileReader fr = new FileReader(FILE_NAME);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\n--- Student Records ---");
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println(
                        "ID: " + data[0] +
                        ", Name: " + data[1] +
                        ", Marks: " + data[2]
                );
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();

        writeStudentRecord(id, name, marks);
        readStudentRecords();

        sc.close();
    }
}
