package template.report;

public class HTMLReport extends GeneralReport{
    protected HTMLReport(DataOperations dataOperations) {
        super(dataOperations);
    }

    @Override
    protected void doGenerateReport() {
        System.out.println("Generating HTML report...");
    }
}
