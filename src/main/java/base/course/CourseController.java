package base.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("search")
    public Course findCourse(@RequestBody Course input) {
        return courseRepository.findByName(input.getName());
    }

    @GetMapping("{id}")
    public Course find(@PathVariable Long id) {
        return courseRepository.findOne(id);
    }

}
