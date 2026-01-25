package com.marakicode.designpatterns.behavioral.templatemethod;

public class TransferMoneyTask extends Task {

    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Transfer money");
    }

}
