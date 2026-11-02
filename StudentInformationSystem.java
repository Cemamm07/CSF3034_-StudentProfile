/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmodule2;

/**
 *
 * @author User
 */
public class StudentInformationSystem {
    public static void main(String[] args) {
        // Step 1: Display student name and student ID[cite: 17]
        String studentName = "MUHAMMAD AMSYAR HADIF BBIN MD NAZIM";
        String studentID = "S87301";
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);

        // Step 2: Store two marks using variables[cite: 17]
        double mark1 = 45.0;
        double mark2 = 48.0;

        // Step 3 & 4: Calculate and display the total mark[cite: 17]
        double totalMark = mark1 + mark2;
        System.out.println("Total Mark: " + totalMark + " / 100");

        // Step 5: Display a message based on the total[cite: 17]
        if (totalMark >= 85) {
            System.out.println("Result: Excellent");
        } else if (totalMark >= 60) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }

    
}
