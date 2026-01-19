package Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "Educator")
public class Educator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String SubjectName;

    @Column(nullable = false)
    private String EducatorName;
}
