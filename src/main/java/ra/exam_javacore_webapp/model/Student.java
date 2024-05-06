package ra.exam_javacore_webapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer studentId;
    @Column(columnDefinition = "varchar(100)", name = "student_name")
    private String studentName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private Boolean sex = true;
    @Column(name = "phone_number", columnDefinition = "varchar(15)")
    private String phoneNumber;
    @Column(columnDefinition = "varchar(255)")
    private String  address;
    @Column(name = "image_url", columnDefinition = "varchar(255)")
    private String imgUrl;

}
