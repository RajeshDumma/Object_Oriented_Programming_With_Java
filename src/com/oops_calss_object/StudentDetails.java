package com.oops_calss_object;

public class StudentDetails {

    int studentId;
    String name;
    String department;
    int marks;

    void displayDetails() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Marks: " + marks);

        System.out.println((marks >= 40) ? "Result: Pass" : "Result: Fail");
    }

    public static void main(String[] args) {

        StudentDetails st = new StudentDetails();

        st.studentId = 101;
        st.name = "Rajesh";
        st.department = "Software Engineering";
        st.marks = 80;

        st.displayDetails();
    }
}