package test;

public class BankAccount {
    private int balance;
    private Person owner;

    public BankAccount(int balance){
        if (balance < 0){
            balance = 0;
        }else {
            this.balance = balance;
        }
    }
    public BankAccount(Person owner){
        this.owner = owner;
        balance = 0;
    }
    public BankAccount(int balance, Person owner) {
        if (balance < 0) {
            balance = 0;
        } else {
            this.balance = balance;
        }
        this.owner = owner;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
    public Person getOwner(){
        return owner;
    }
    public void setOwner(Person owner){
        this.owner = owner;
    }

    boolean deposit(int amount) {
        if(amount < 0 || owner.getCashAmount() < amount){
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount()+ "원");
            return false;
        }
        balance += amount;
        owner.setCashAmount(owner.getCashAmount() - amount);

        System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount()+ "원");
        return true;
    }

    public boolean deposit(double amount, double exchangeRate){
        return deposit((int)(amount *exchangeRate));
    }

    boolean withdraw(int amount) {
        if(amount < 0 || balance<amount){
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
        balance -= amount;
        owner.setCashAmount(owner.getCashAmount() + amount);
        System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount()+ "원");
        return true;
    }
    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }
    public boolean transfer(BankAccount to, int amount) {
        boolean success;
        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            balance -= amount;
            to.balance += amount;
            success = true;
        }

        System.out.println(success + " - from: " + owner.getName()
                + ", to: " + to.owner.getName()
                + ", amount: " + amount
                + ", balance: " + balance);

        return success;
    }
}
