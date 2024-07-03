package template.report;

public class Demo {
    public static void main(String[] args) {
        var dataOperations = new DataOperations();

        var pdfReport = new PDFReport(dataOperations);
        pdfReport.generateReport();

        var csvReport = new CSVReport(dataOperations);
        csvReport.generateReport();
    }
}
