package pl.exsio.querydsl.entityql.jpa.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "JSINGULAR_PK")
public class JSingularPk {

    @Id
    @Column(name = "ID_1")
    private Long id1;

    @Column(name = "ID_2")
    private String id2;

    @Column(name = "DESC")
    private String desc;

    @OneToMany(mappedBy = "singularPk")
    private List<JCompositeFk> compositeFks;

    public JSingularPk() {
    }

    public JSingularPk(Long id1, String id2, String desc) {
        this.id1 = id1;
        this.id2 = id2;
        this.desc = desc;
    }

    Long getId1() {
        return id1;
    }

    String getId2() {
        return id2;
    }

    String getDesc() {
        return desc;
    }
}
