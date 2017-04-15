package base.course;

import javax.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String prefix;
    private String suffix;
    private String title;
    private String units;
    @Column(columnDefinition = "TEXT")
    private String prerequisites;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String termsOffered;

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSuffix() {
        return suffix;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
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
