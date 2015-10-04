package bananaplan.domain.dao;

import javax.persistence.*;

@Entity
@Table(name="accounts")
public class AccountDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String username;

    private String password;

    private String salt;

    @ManyToOne
    @JoinColumn(name="company_id")
    private CompanyDAO companyDAO;

    public AccountDAO(String username, String password, String salt, CompanyDAO companyDAO) {
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.companyDAO = companyDAO;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public CompanyDAO getCompanyDAO() {
        return companyDAO;
    }

    public void setCompanyDAO(CompanyDAO companyDAO) {
        this.companyDAO = companyDAO;
    }
}
