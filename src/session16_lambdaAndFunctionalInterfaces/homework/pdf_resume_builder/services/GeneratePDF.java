package session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.services;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.domain.Education;
import session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.domain.PersonalInformation;
import session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.domain.Resume;
import session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.domain.WorkExperience;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratePDF {

    private static final PDType1Font FONT = PDType1Font.TIMES_ROMAN;
    private static final int FONT_SIZE = 12;
    private static final int TITLE_SIZE = 18;
    private static final float LEADING = 2f;
    private static final int ALIGNMENT = 90;
    private static float X = 50F;
    private static float Y = 700F;

    public static void generateResume(Resume resume) throws IOException {
        String filename = "/Users/david/desktop/" + resume.getPersonalInformation().getName() + ".pdf";
        try (PDDocument doc = new PDDocument()) {
            PDPage page = new PDPage();
            doc.addPage(page);
            PDPageContentStream contentStream = new PDPageContentStream(doc, page);

            drawPersonalInformation(contentStream, resume.getPersonalInformation());
            drawObjectives(contentStream, resume.getObjectives());
            drawEducation(contentStream, resume.getEducationList());
            drawWorkExperience(contentStream, resume.getWokExperienceList());
            drawSkills(contentStream, resume.getSkills());

            PDImageXObject imageXObject = PDImageXObject.createFromFile("/Users/david/java/src/session16_lambdaAndFunctionalInterfaces/homework/pdf_resume_builder/resources/img.png", doc);
            contentStream.drawImage(imageXObject, 450, 650, 100, 100);
            contentStream.close();

            File f = new File(filename);
            FileOutputStream fOut = new FileOutputStream(f);
            doc.save(fOut);
        }
    }

    private static void drawPersonalInformation(PDPageContentStream contentStream, PersonalInformation personalInformation) throws IOException {
        drawSectionTitle(contentStream, "PERSONAL INFORMATION");

        contentStream.beginText();
        contentStream.setFont(FONT, FONT_SIZE);
        contentStream.setLeading(LEADING);

        contentStream.newLineAtOffset(X + 10, Y);
        contentStream.showText("Name");
        contentStream.newLineAtOffset(ALIGNMENT, 0);
        contentStream.showText(personalInformation.getName());

        contentStream.newLineAtOffset(-ALIGNMENT, -FONT_SIZE - LEADING);
        contentStream.showText("Address");
        contentStream.newLineAtOffset(ALIGNMENT, 0);
        contentStream.showText(personalInformation.getAddress());

        contentStream.newLineAtOffset(-ALIGNMENT, -FONT_SIZE - LEADING);
        contentStream.showText("Email");
        contentStream.newLineAtOffset(ALIGNMENT, 0);
        contentStream.showText(personalInformation.getEmail());

        contentStream.newLineAtOffset(-ALIGNMENT, -FONT_SIZE - LEADING);
        contentStream.showText("Phone number");
        contentStream.newLineAtOffset(ALIGNMENT, 0);
        contentStream.showText(personalInformation.getPhoneNumber());
        Y = Y - 3 * FONT_SIZE * LEADING;
        contentStream.endText();
    }

    private static void drawObjectives(PDPageContentStream contentStream, String objectives) throws IOException {
        drawSectionTitle(contentStream, "OBJECTIVES");
        drawMultipleLines(contentStream, objectives, X + 10, Y, 500);
    }

    private static void drawEducation(PDPageContentStream contentStream, List<Education> educationList) throws IOException {
        drawSectionTitle(contentStream, "EDUCATION");

        for (Education education : educationList) {
            contentStream.beginText();
            contentStream.setFont(FONT, FONT_SIZE);
            contentStream.setLeading(LEADING);

            contentStream.newLineAtOffset(X + 10, Y);
            contentStream.showText("University name");
            contentStream.newLineAtOffset(ALIGNMENT, 0);
            contentStream.showText(education.getUniversityName());

            contentStream.newLineAtOffset(-ALIGNMENT, -FONT_SIZE - LEADING);
            contentStream.showText("Degree");
            contentStream.newLineAtOffset(ALIGNMENT, 0);
            contentStream.showText(education.getDegree());

            contentStream.newLineAtOffset(-ALIGNMENT, -FONT_SIZE - LEADING);
            contentStream.showText("Graduation");
            contentStream.newLineAtOffset(ALIGNMENT, 0);
            contentStream.showText(education.getGraduationDate());
            contentStream.endText();
            Y = Y - 4 * FONT_SIZE;
        }
        Y -= FONT_SIZE;
    }

    private static void drawSectionTitle(PDPageContentStream contentStream, String sectionTitle) throws IOException {

        contentStream.beginText();
        contentStream.setFont(FONT, TITLE_SIZE);
        contentStream.setLeading(LEADING + FONT_SIZE);
        contentStream.setStrokingColor(Color.BLUE);
        contentStream.newLineAtOffset(X, Y);
        contentStream.showText(sectionTitle);
        contentStream.newLine();
        Y = Y - TITLE_SIZE - LEADING;
        contentStream.endText();
    }

    private static void drawWorkExperience(PDPageContentStream contentStream, List<WorkExperience> workExperiencesList) throws IOException {
        drawSectionTitle(contentStream, "WORK EXPERIENCE");

        for (WorkExperience workExperience : workExperiencesList) {
            contentStream.beginText();
            contentStream.setFont(FONT, FONT_SIZE);
            contentStream.setLeading(LEADING);

            contentStream.newLineAtOffset(X + 10, Y);
            contentStream.showText("Company name");
            contentStream.newLineAtOffset(ALIGNMENT, 0);
            contentStream.showText(workExperience.getCompanyName());

            contentStream.newLineAtOffset(-ALIGNMENT, -FONT_SIZE - LEADING);
            contentStream.showText("Job title");
            contentStream.newLineAtOffset(ALIGNMENT, 0);
            contentStream.showText(workExperience.getJobTitle());

            contentStream.newLineAtOffset(-ALIGNMENT, -FONT_SIZE - LEADING);
            contentStream.showText("Job description");
            contentStream.newLineAtOffset(ALIGNMENT, Y);
            Y = Y - 2.2f * FONT_SIZE;
            contentStream.endText();
            drawMultipleLines(contentStream, workExperience.getJobDescription(), X + ALIGNMENT + 10, Y - LEADING, 400);
            contentStream.beginText();

            Y += FONT_SIZE;
            contentStream.newLineAtOffset(X + 10, Y);
            contentStream.showText("Duration");
            contentStream.newLineAtOffset(ALIGNMENT, 0);
            contentStream.showText(workExperience.getDuration());
            contentStream.endText();
            Y = Y - FONT_SIZE * 2;
        }
    }

    private static void drawSkills(PDPageContentStream contentStream, List<String> skills) throws IOException {
        drawSectionTitle(contentStream, "SKILLS");
        for (String skill : skills) {
            contentStream.beginText();
            contentStream.setFont(FONT, FONT_SIZE);
            contentStream.setLeading(LEADING);

            contentStream.newLineAtOffset(X + 10, Y);
            contentStream.showText("\u2022 " + skill);
            Y -= FONT_SIZE * 1.2f;
            contentStream.endText();
        }
    }

    private static void drawMultipleLines(PDPageContentStream contentStream, String text, float x, float y, float maxLength) throws IOException {
        List<String> lines = new ArrayList<>();
        StringBuilder myLine = new StringBuilder("");

        String[] words = text.replace("\n", " ").split(" ");
        for (String word : words) {
            if (!myLine.isEmpty()) {
                myLine.append(" ");
            }
            int size = (int) (FONT_SIZE * FONT.getStringWidth(myLine + word) / 1000);
            if (size > maxLength) {
                lines.add(myLine.toString());
                myLine.setLength(0);
            }
            myLine.append(word);
        }
        lines.add(myLine.toString());


        for (String line : lines) {
            contentStream.beginText();
            contentStream.setFont(FONT, FONT_SIZE);
            contentStream.setLeading(LEADING);
            contentStream.newLineAtOffset(x, y);
            contentStream.showText(line);
            contentStream.endText();
            Y = Y - FONT_SIZE - (LEADING * 2);
            y = Y;
        }
        Y -= FONT_SIZE;
    }
}
