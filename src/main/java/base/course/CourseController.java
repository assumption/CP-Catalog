package base.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public ArrayList<Course> listAll() {
        ArrayList<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(course -> courses.add(course));
        return courses;
    }

    @GetMapping("{name}")
    public Course find(@PathVariable String name) {
        return courseRepository.findByName(name.toUpperCase());
    }

    @GetMapping("/prefix/{prefix}")
    public ArrayList<Course> listAllPrefix(@PathVariable String prefix) {
        ArrayList<Course> courses = new ArrayList<>();
        courseRepository.findByPrefix(prefix.toUpperCase()).forEach(course -> courses.add(course));
        return courses;
    }

}
