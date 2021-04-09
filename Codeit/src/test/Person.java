package test;

public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String name, int age){
        if (age < 0) {
            age = 12;
        } else {
            this.age =age;
        }
        this.name = name;
        cashAmount = 0;
   }

    public Person(String name, int age, int cashAmount){
        if (age < 0) {
            age = 12;
        } else {
            this.age = age;
        }
        this.name = name;
        if(cashAmount < 0){
            cashAmount = 0;
        }else {
            this.cashAmount = cashAmount;
        }
   }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setCashAmount(int cashAmount){
        this.cashAmount = cashAmount;
    }
    public int getCashAmount(){
        return cashAmount;
    }
    public void setAccount(BankAccount account){
        this.account =account;
    }
    public BankAccount getAccount(){
        return account;
    }
    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);
    }
    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }
}
