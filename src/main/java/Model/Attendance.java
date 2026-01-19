package Model;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.User;

import java.util.Date;

@Data
@Entity(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Educator SubjectId;

    @Column(nullable = false)
    private String StudentName;

    @Column(nullable = false)
    private String Status;

    @Column(nullable = false)
    private Date Date;

}

