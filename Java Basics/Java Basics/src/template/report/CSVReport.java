package template.report;

public class CSVReport extends GeneralReport{
    protected CSVReport(DataOperations dataOperations) {
        super(dataOperations);
    }

    @Override
    protected void doGenerateReport() {
        System.out.println("Generating CSV report...");
    }
}
