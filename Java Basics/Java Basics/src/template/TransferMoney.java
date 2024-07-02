package template;

public class TransferMoney extends Task{
    public TransferMoney(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doTask() {
        System.out.println("Transferring money....");
    }
}
