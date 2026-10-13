package org.OOPExamples;

public class BankAccountMain11 {
    public static void main(String[] args) {
        BankAccount11 bank1 = new BankAccount11();
        bank1.setAccountNo(1111);
        bank1.setBalance(1000);
        System.out.println("First account number= " + bank1.getAccountNo() + " first balance = " + bank1.getBalance());
        bank1.setAccountNo(2222);
        bank1.setBalance(2000);
        System.out.println("Account number= " + bank1.getAccountNo() + " available balance = " + bank1.getBalance());
    }
}
