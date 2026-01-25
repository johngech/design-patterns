package com.marakicode.designpatterns.behavioral.templatemethod;

public class TestTemplateMethod {
    public static void test(){
        AuditTrail auditTrail = new AuditTrail();
        var transfer = new TransferMoneyTask(auditTrail);
        transfer.execute();
        var report = new GenerateReportTask(auditTrail);
        report.execute();
    }
}
