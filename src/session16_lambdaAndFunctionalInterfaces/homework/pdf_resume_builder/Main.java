package session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder;

import session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.domain.Resume;
import session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.services.FileProcessor;
import session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.services.FileReader;
import session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.services.GeneratePDF;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String str = FileReader.readFile("resume.txt");
        Resume resume = FileProcessor.getResumeFromString(str);
        GeneratePDF.generateResume(resume);
        System.out.println(resume);
    }
}
