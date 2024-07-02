package template;

public class Demo {
    public static void main(String[] args) {
        Task task1 = new TransferMoney(new AuditTrail());
        task1.execute();

        Task task2 = new GenerateRecord(new AuditTrail());
        task2.execute();
        task2.doTask();
    }
}
