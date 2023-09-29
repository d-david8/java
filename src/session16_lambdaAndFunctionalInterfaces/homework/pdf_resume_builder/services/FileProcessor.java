package session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.services;

import session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.domain.Education;
import session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.domain.PersonalInformation;
import session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.domain.Resume;
import session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.domain.WorkExperience;

import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    public static Resume getResumeFromString(String text) {
        Resume resume = new Resume();
        String[] lines = text.split("\n");

        StringBuilder buffer = new StringBuilder();
        List<String> sections = new ArrayList<>();
        for (String line : lines) {
            if (!line.equals("")) {
                buffer.append(line).append("\n");
            } else {
                sections.add(buffer.toString());
                buffer.setLength(0);
            }
        }
        for (String section : sections) {
            //  System.out.println(section);
            if (section.contains("Personal")) {
                resume.setPersonalInformation(processPersonalInfo(section));
            } else if (section.contains("Objective"))
                resume.setObjectives(processObjective(section));
            else if (section.contains("University Name")) {
                resume.addEducation(processEducation(section));
            } else if (section.contains("Job")) {
                resume.addWorkExperience(processWorkExperience(section));
            } else if (section.contains("Skills")) {
                resume.setSkills(processSkills(section));
                System.out.println(section);
            }
        }
        return resume;
    }

    private static List<String> processSkills(String input) {
        List<String> skills = new ArrayList<>();
        String[] lines = input.split("\n");
        for (String line : lines) {
            if (line.contains("-")) {
                skills.add(line.substring(2));
            }
        }
        return skills;
    }

    private static PersonalInformation processPersonalInfo(String input) {
        PersonalInformation personalInformation = new PersonalInformation();
        String[] lines = input.split("\n");
        for (String line : lines) {
            if (line.contains("Name")) {
                personalInformation.setName(line.split(": ")[1]);
            } else if (line.contains("Address")) {
                personalInformation.setAddress(line.split(": ")[1]);
            } else if (line.contains("Phone")) {
                personalInformation.setPhoneNumber(line.split(": ")[1]);
            } else if (line.contains("Email")) {
                personalInformation.setEmail(line.split(": ")[1]);
            }
        }
        return personalInformation;
    }

    private static String processObjective(String input) {
        return input.split(":")[1].trim();
    }

    private static Education processEducation(String input) {
        Education education = new Education();
        String[] lines = input.split("\n");
        for (String line : lines) {
            if (line.contains("University Name")) {
                education.setUniversityName(line.split(": ")[1]);
            } else if (line.contains("Degree")) {
                education.setDegree(line.split(": ")[1]);
            } else if (line.contains("Graduation Date")) {
                education.setGraduationDate(line.split(": ")[1]);
            }
        }
        return education;
    }

    private static WorkExperience processWorkExperience(String input) {
        WorkExperience workExperience = new WorkExperience();
        String[] lines = input.split("\n");
        for (String line : lines) {
            if (line.contains("Company Name")) {
                workExperience.setCompanyName(line.split(": ")[1]);
            } else if (line.contains("Job Title")) {
                workExperience.setJobTitle(line.split(": ")[1]);
            } else if (line.contains("Job Description")) {
                workExperience.setJobDescription(line.split(": ")[1]);
            } else if (line.contains("Duration")) {
                workExperience.setDuration(line.split(": ")[1]);
            }
        }
        return workExperience;
    }

}
