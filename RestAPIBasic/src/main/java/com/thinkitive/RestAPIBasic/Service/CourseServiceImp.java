package com.thinkitive.RestAPIBasic.Service;

import com.thinkitive.RestAPIBasic.Entity.Course;

import java.util.List;

public interface CourseServiceImp {

     List<Course> getCourses();

     Course getCourse(int courseId);

     Course addCourse(Course course);

     boolean deleteCourse(int courseId);


}
