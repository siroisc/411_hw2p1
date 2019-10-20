package com.example.astroswin.Model;

public class CourseEnrollment {
    private String CourseID;
    private String Grade;

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public CourseEnrollment(String courseid, String grade) {
        this.CourseID = courseid;
        this.Grade = grade;
    }


}
