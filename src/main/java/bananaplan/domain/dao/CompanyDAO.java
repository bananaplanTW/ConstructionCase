package bananaplan.domain.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by paulou on 10/3/15.
 * All Rights Reserved By BananaPlanTw
 */
@Entity
@Table(name = "companies")
public class CompanyDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @JsonIgnore
    @OneToMany(mappedBy="companyDAO")
    private Set<AccountDAO> accountDAOs;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<AccountDAO> getAccountDAOs() {
        return accountDAOs;
    }

    public void setAccountDAOs(Set<AccountDAO> accountDAOs) {
        this.accountDAOs = accountDAOs;
    }

    @Override
    public String toString() {
        return "CompanyDAO{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
