package session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.domain;

public class Education {
    private String universityName;
    private String degree;
    private String graduationDate;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    @Override
    public String toString() {
        return " University: " + universityName + "\n" +
                "Degree" + degree + "\n" +
                "Graduation date: " + graduationDate + "\n";
    }
}
