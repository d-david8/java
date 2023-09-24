package session11_abstraction.practice.data_transformation_system;

import java.util.List;

class CSVReport extends Report implements CSVExportable {

    CSVReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {
    }

    @Override
    public void exportToCsv() {
    }
}
