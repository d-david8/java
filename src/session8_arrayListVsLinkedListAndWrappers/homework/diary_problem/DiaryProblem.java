package session8_arrayListVsLinkedListAndWrappers.homework.diary_problem;

import java.time.LocalDate;

public class DiaryProblem {
    public static void main(String[] args) {
        Diary diary= new Diary();

        populateDiary(diary);
        diary.addEntry("2022-01-01, error");
        diary.edidEntry(LocalDate.parse("2025-01-01"),"Edited text");
        diary.deleteEntry(LocalDate.parse("2023-01-01"));
        diary.displayDiary();
    }
    public static void populateDiary(Diary diary){
        diary.addEntry("2022-01-01, text 1");
        diary.addEntry("2023-01-01, text 2");
        diary.addEntry("2020-03-01, text 3");
        diary.addEntry("2020-01-01, text 4");
        diary.addEntry("2024-01-01, text 5");
        diary.addEntry("2025-01-01, text 6");

    }

}
