package template;

public class GenerateRecord extends Task{
    public GenerateRecord(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doTask() {
        System.out.println("Generating record...");
    }
}
