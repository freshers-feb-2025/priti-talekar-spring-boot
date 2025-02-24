package com.thinkitive.RestAPIBasic.Service;

import com.thinkitive.RestAPIBasic.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService implements CourseServiceImp{

    List<Course>list;

    public CourseService(){
        list=new ArrayList<>();
        list.add(new Course(101,"Java core"));
        list.add(new Course(102,"full stack"));
    }

    public List<Course> getCourses(){
         return list;
    }

    @Override
    public Course getCourse(int courseId) {
         Course course=null;
         for(Course c:list){
             if(c.getCourseId()==courseId){
                 course=c;
                 break;
             }

         }
        return course;
    }


    public Course addCourse(Course course){
        list.add(course);
        return course;
    }

    public boolean deleteCourse(int courseId){
        Course courseToDelete = null;
        for (Course c : list) {
            if (c.getCourseId() == courseId) {
                courseToDelete = c;
                break;
            }
        }

        if (courseToDelete != null) {
            list.remove(courseToDelete);
            return true;  // Successfully deleted
        } else {
            return false;  // Course not found
        }
    }

}
