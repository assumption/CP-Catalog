package base.course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String title;
    private String units;
    private String prerequisites;
    private String description;
    private String termsOffered;

    public Course() {
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getUnits() {
        return units;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public String getDescription() {
        return description;
    }

    public String getTermsOffered() {
        return termsOffered;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTermsOffered(String termsOffered) {
        this.termsOffered = termsOffered;
    }
}
