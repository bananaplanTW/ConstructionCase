package bananaplan.domain.dao;

/**
 * Created by paulou on 10/3/15.
 */
public enum OrientationDAO {
    A("東面"),
    AB(""),
    B("西面"),
    BC(""),
    C("南面"),
    CD(""),
    D("北面"),
    AD("");

    private String name;

    OrientationDAO(String name) {
        this.name = name;
    }
}
