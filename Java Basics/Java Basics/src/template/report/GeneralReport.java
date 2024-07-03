package template.report;

public abstract class GeneralReport {
    private DataOperations dataOperations;

    protected GeneralReport(DataOperations dataOperations) {
        this.dataOperations = dataOperations;
    }

    public void generateReport(){
        dataOperations.collectData();
        dataOperations.formatData();
        dataOperations.exportData();

        doGenerateReport();
    }

    protected abstract void doGenerateReport();
}
