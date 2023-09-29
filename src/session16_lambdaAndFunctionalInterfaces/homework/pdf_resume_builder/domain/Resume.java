package session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.domain;

import java.util.ArrayList;
import java.util.List;

public class Resume {

    private PersonalInformation personalInformation;
    private String objectives;
    private List<Education> educationList = new ArrayList<>();
    private List<WorkExperience> workExperienceList = new ArrayList<>();
    private List<String> skills = new ArrayList<>();

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    public List<Education> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<Education> educationList) {
        this.educationList = educationList;
    }

    public List<WorkExperience> getWokExperienceList() {
        return workExperienceList;
    }

    public void setWokExperienceList(List<WorkExperience> workExperienceList) {
        this.workExperienceList = workExperienceList;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void addEducation(Education education) {
        educationList.add(education);
    }

    public void addWorkExperience(WorkExperience workExperience) {
        workExperienceList.add(workExperience);
    }

    @Override
    public String toString() {
        return "Resume: \n" +
                "Personal information:\n" + personalInformation + "\n" +
                "Objectives:\n" + objectives + "\n\n" +
                "Education:\n" + educationList +
                "Work experience:\n " + workExperienceList +
                ", skills=" + skills +
                '}';
    }
}
