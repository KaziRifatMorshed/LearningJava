package account;
import java.text.NumberFormat;
public class Account
{
  private final double RATE = 0.035;  // interest rate of 3.5%
  private long acctNumber;
  private double balance;
  private String name;
  
  public Account (String owner, long account_no, double initial_balance) {
    name = owner;
    acctNumber = account_no;
    balance = initial_balance;
  }
  public Account (String owner, long account_no) {
    name = owner;
    acctNumber = account_no;
    balance = 0;
  }

  public void deposit (double amount)  { // balance add kora
    if (amount > 0) // good practice
      balance = balance + amount;
  }

  public double getBalance ()
  {
    return balance;
  }

  public void withdraw (double amount)  {
    if (amount <= balance)
      balance = balance - amount ;
  }

  public void Transfer(Account to){
    to.balance = to.balance + balance;
    balance = 0;
    System.out.println("(full)Balance has been transferred successfully.");
  }

  public void Transfer_V2(Account a){
    // deposit mane add kroa, a te sob add korbo, er por this.balance faka korbo //
    a.deposit(balance); // per er vitor je ache tar $ ke add kore debo
    balance = 0;
    System.out.println("Balance has been transferred successfully.");
  }

  public String toString (){
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    //return (acctNumber + "\t" + name + "\t" + balance.NumberFormat.getCurrencyInstance());
    return (STR."Acc Number: \{acctNumber}\tAcc Name: \{name}\tBalance: \{fmt.format(balance)}");
  }
}

