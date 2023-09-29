package session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.domain;

public class WorkExperience {
    private String companyName;
    private String jobTitle;
    private String jobDescription;
    private String duration;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Company name: '" + companyName + "\n" +
                "Job title: " + jobTitle + "\n" +
                "Job description: " + jobDescription + "\n" +
                "Duration: " + duration + "\n";
    }
}
