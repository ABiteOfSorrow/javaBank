public class BankAccount {
    private int balance;
    private Person owner;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int pBalance) {
        balance = pBalance;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person pOwner) {
        owner = pOwner;
    }

    boolean deposit(int amount) {
        // 1. write code here
        if (amount > 0 && owner.getCashAmount() - amount > 0) {
            balance += amount;
            owner.setCashAmount(owner.getCashAmount() - amount);
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        } else {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
    }

    boolean withdraw(int amount) {
        // 2. write code here
        if (amount > 0 && balance - amount > 0) {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        } else {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
    }


}