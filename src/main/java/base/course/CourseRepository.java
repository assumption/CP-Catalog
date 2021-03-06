package base.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
    Course findByName(String name);

    java.lang.Iterable<Course> findByPrefix(String prefix);
}
