package session8_arrayListVsLinkedListAndWrappers.homework.diary_problem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    private static final List<String> diaryEntries = new ArrayList<>();

    public void addEntry(String input) {
        if (diaryEntries.isEmpty()) {
            diaryEntries.add(input);
        } else {
            String inputStringDate = input.split(",")[0];
            LocalDate inputDate = LocalDate.parse(inputStringDate);

            int position = findPosition(inputDate, "add");
            if (position == -1) {
                System.out.println("Already exist an entry on this date: " + inputStringDate);
            } else {
                diaryEntries.add(position, input);
            }
        }
    }

    public void edidEntry(LocalDate date, String newEntry) {
        int position = findPosition(date, "edit");
        if (position == -1) {
            System.out.println("Entry with date:" + date.toString() + " was not found!");
        } else
            diaryEntries.set(position, date.toString() + "," + newEntry);
    }

    public void deleteEntry(LocalDate date) {
        int position = findPosition(date, "delete");
        if (position == -1) {
            System.out.println("Entry with date:" + date.toString() + " was not found!");
        } else
            diaryEntries.remove(position);
    }

    public void displayDiary() {
        for (int i = diaryEntries.size() - 1; i >= 0; i--) {
            System.out.println(diaryEntries.get(i));
        }
    }

    private static int findPosition(LocalDate inputDate, String operationType) {
        int left = 0;
        int right = diaryEntries.size() - 1;
        int position = -1;
        while (left <= right) {
            int middle = (left + right) / 2;
            String currentStringDate = diaryEntries.get(middle).split(",")[0];
            LocalDate currentDate = LocalDate.parse(currentStringDate);
            int comparisonResult = currentDate.compareTo(inputDate);

            if (comparisonResult == 0) {
                position = middle;
                break;
            } else if (comparisonResult < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        if (operationType.equals("add")) {
            return position == -1 ? left : -1;
        } else {
            return position;
        }
    }
}
