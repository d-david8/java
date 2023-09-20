package session16.homework.pdf_resume_builder.services;

import session16.homework.pdf_resume_builder.Resume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileProcessor {

    public static void processFile(List<String> lines){
        Resume resume= new Resume();
        for(String line:lines){
            List<String> stringList = new ArrayList<>(Arrays.stream(line.split(":")).toList());
            if (stringList.size() == 1){

            }
        }
    }

}
