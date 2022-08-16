package programacion_web_backend.grupo_1_A.feature;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("persons")
public class Person {
    @Id
    private long id;
    private String dni;
    private String name;
    private String lastname;
    @Column("contact_number")
    private String contactNumber;
    private Date birthday;
    @Column("family_burdens")
    private int familyBurdens;
    private boolean disability;
    @Column("disability_percent")
    private float disabilityPercent;
    private boolean archived; 
}