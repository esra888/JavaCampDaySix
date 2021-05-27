package kodlamaio.Day6.Entities.Concretes;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "job_titles")
@Data
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String jobTitle;
}
