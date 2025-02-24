package com.thinkitive.RestAPIBasic.Controller;

import com.thinkitive.RestAPIBasic.Entity.Course;
import com.thinkitive.RestAPIBasic.Service.CourseService;
import com.thinkitive.RestAPIBasic.Service.CourseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseServiceImp courseServiceImp;

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseServiceImp.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseServiceImp.getCourse(Integer.parseInt(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
          return  this.courseServiceImp.addCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable String courseId){
        boolean deleteCourse= this.courseServiceImp.deleteCourse(Integer.parseInt(courseId));

        if(deleteCourse){
            return "course With Id "+courseId+" deleted successfully";
        }else{
            return "Course with Id "+courseId+" not found";
        }
    }

}
