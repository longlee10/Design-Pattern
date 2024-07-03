package template.report;

public class PDFReport extends GeneralReport{
    protected PDFReport(DataOperations dataOperations) {
        super(dataOperations);
    }

    @Override
    protected void doGenerateReport() {
        System.out.println("Generating PDF report...");
    }
}
