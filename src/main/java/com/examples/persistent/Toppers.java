package com.examples.persistent;

public class Toppers {
    private String studentName;
    private String subect;
    private int grade;

    public Toppers() {
    }
    public Toppers(String studentName, String subect, int grade) {
        this.studentName = studentName;
        this.subect = subect;
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubect() {
        return subect;
    }

    public void setSubect(String subect) {
        this.subect = subect;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Toppers{" +
                "studentName='" + studentName + '\'' +
                ", subect='" + subect + '\'' +
                ", grade=" + grade +
                '}';
    }
}
