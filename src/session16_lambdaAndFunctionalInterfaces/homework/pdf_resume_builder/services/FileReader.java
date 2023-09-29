package session16_lambdaAndFunctionalInterfaces.homework.pdf_resume_builder.services;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileReader {
    public static String readFile(String fileName) {

        List<String> lines = new LinkedList<>();
        try {
            File file = new File("/Users/david/java/src/session16_lambdaAndFunctionalInterfaces/homework/pdf_resume_builder/resources/" + fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines.stream().collect(Collectors.joining("\n"));
    }
}
