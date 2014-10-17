package biz.hahamo.dev.enterprise.example.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
// @DiscriminatorValue("TRIANGLE")
@Table(name = "TRIANGLE_PERCLASS")
public class TrianglePerclass extends ShapePerclass {

    private static final long serialVersionUID = -1783113903772499963L;

    @Column(name = "EQUAL_SITES")
    private Boolean equalSites;

    public Boolean getEqualSites() {
        return equalSites;
    }

    public void setEqualSites(Boolean equalSites) {
        this.equalSites = equalSites;
    }

}
