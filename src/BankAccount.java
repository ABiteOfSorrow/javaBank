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

    public BankAccount(int pBalance) {
        if (pBalance < 0) {
            balance = 0;
        } else {
            balance = pBalance;
        }
    }

    public BankAccount(Person pOwner) {
        owner = pOwner;
        balance = 0;
    }

    public BankAccount(int pBalance, Person pOwner) {
        if (pBalance < 0) {
            balance = 0;
        } else {
            balance = pBalance;
        }
        owner = pOwner;
    }

    boolean deposit(int amount) {
        // 1. write code here
        if (amount > 0 && owner.getCashAmount() - amount >= 0) {
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
        if (amount > 0 && balance - amount >= 0) {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        } else {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
    }

    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }

    public boolean transfer(BankAccount to, int amount) {
        if (amount > 0 && balance - amount >= 0) {
            balance -= amount;
            to.balance += amount;
            System.out.println("true - from: " + owner.getName() + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + balance);
            return true;
        } else {
            System.out.println("false - from: " + owner.getName() + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + balance);
            return false;
        }
    }

}