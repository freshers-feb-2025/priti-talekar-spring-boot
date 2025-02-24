package com.thinkitive.RestAPIBasic.Entity;

public class Course {
    private int courseId;

    private String coursename;

    public Course(int courseId, String coursename) {
        this.courseId = courseId;
        this.coursename = coursename;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", coursename='" + coursename + '\'' + '}';
    }
}
