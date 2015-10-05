package bananaplan.domain.dao;

import javax.persistence.*;

/**
 * Created by paulou on 10/4/15.
 * All rights are reserved by BananaPlanTw
 */
@Entity
@Table(name ="categories")
public class CategoryDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

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
}