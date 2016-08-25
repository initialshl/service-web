package sg.ncl.testbed_interface;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class ExperimentForm {

    private String teamId;
    private String teamName;

    @NotEmpty(message = "Team cannot be empty")
    @Size(min = 1, message = "Team cannot be empty")
    private String teamNameWithId;

    @NotEmpty(message = "Experiment Name cannot be empty")
    @Size(min = 1, message = "Experiment Name cannot be empty")
    private String name;

    @NotEmpty(message = "Description cannot be empty")
    @Size(min = 1, message = "Description cannot be empty")
    private String description;
    private String nsFile;

    private String nsFileContent;
    private Integer idleSwap;
    private Integer maxDuration;

    private String scenarioFileName;
    private String scenarioContents;

    public ExperimentForm() {}

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNsFile() {
        return nsFile;
    }

    public void setNsFile(String nsFile) {
        this.nsFile = nsFile;
    }

    public String getNsFileContent() {
        return nsFileContent;
    }

    public void setNsFileContent(String nsFileContent) {
        this.nsFileContent = nsFileContent;
    }

    public Integer getIdleSwap() {
        return idleSwap;
    }

    public void setIdleSwap(Integer idleSwap) {
        this.idleSwap = idleSwap;
    }

    public Integer getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    public String getTeamNameWithId() {
        return teamNameWithId;
    }

    public void setTeamNameWithId(String teamNameWithId) {
        this.teamNameWithId = teamNameWithId;
        // separate team name and team id
        // cannot split by '-' because id has '-'
        String[] parts = teamNameWithId.split(":");
        this.teamName = parts[0];
        this.teamId = parts[1];
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getScenarioFileName() {
        return scenarioFileName;
    }

    public void setScenarioFileName(String scenarioFileName) {
        this.scenarioFileName = scenarioFileName;
    }

    public String getScenarioContents() {
        return scenarioContents;
    }

    public void setScenarioContents(String scenarioContents) {
        this.scenarioContents = scenarioContents;
    }

}
