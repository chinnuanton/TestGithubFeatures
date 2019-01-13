package com.initial;

public class EntryClass {

    public static void main(String...args){
        System.out.println("This is the entry class");
        Student student=generateStudentDetails();
        System.out.println("Student Name : "+student.getName()+"\n RollNo : "+student
        .getRollNo());
    }

    
    public static Student generateStudentDetails(){
        Student student =new Student();
        student.setName("John");
        student.setRollNo(10);
        return student;
    }
}
