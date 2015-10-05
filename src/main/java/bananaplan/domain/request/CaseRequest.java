package bananaplan.domain.request;

/**
 * Created by paulou on 10/5/15.
 * All rights are reserved by BananaPlanTw
 */
public class CaseRequest {

    private String name;

    private String companyName;

    private String planFile;

    private String elevationFile;

    private String safetyFile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPlanFile() {
        return planFile;
    }

    public void setPlanFile(String planFile) {
        this.planFile = planFile;
    }

    public String getElevationFile() {
        return elevationFile;
    }

    public void setElevationFile(String elevationFile) {
        this.elevationFile = elevationFile;
    }

    public String getSafetyFile() {
        return safetyFile;
    }

    public void setSafetyFile(String safetyFile) {
        this.safetyFile = safetyFile;
    }
}
