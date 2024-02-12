package account;
import java.text.NumberFormat;
public class Account
{
  private final double RATE = 0.035;  // interest rate of 3.5%
  private long acctNumber;
  private double balance;
  private String name;
  
  public Account (String owner, long account, double initial)
  {
    name = owner;
    acctNumber = account;
    balance = initial;
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
      System.out.println("Balance has been transferred successfully.");
  }

  public void Transfer_V2(Account a){
    a.deposit(balance); // per er vitor je ache tar $ ke add kore debo
    balance = 0;
    System.out.println("Balance has been transferred successfully.");
  }

  public String toString ()
  {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    //return (acctNumber + "\t" + name + "\t" + balance.NumberFormat.getCurrencyInstance());
    return (STR."Acc Number: \{acctNumber}\tAcc Name: \{name}\tBalance: \{fmt.format(balance)}");
  }
}

