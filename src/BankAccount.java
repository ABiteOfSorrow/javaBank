public class BankAccount {
    int balance;
    Person owner;

    boolean deposit(int amount) {
        // 1. write code here
        if (amount > 0 && owner.cashAmount - amount > 0) {
            balance += amount;
            owner.cashAmount -= amount;
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return true;
        } else {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return false;
        }
    }

    boolean withdraw(int amount) {
        // 2. write code here
        if (amount > 0 && balance - amount > 0) {
            balance -= amount;
            owner.cashAmount += amount;
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return true;
        } else {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
            return false;
        }
    }


}