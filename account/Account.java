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

  public double deposit (double amount)  { // balance add kora
    if (amount > 0)
      balance = balance + amount;
    return balance;
  }

  public double getBalance ()
  {
    return balance;
  }

  public double withdraw (double amount)  {
    if (amount <= balance)
      balance = balance - amount ;
    return balance;
  }

  public void Transfer(Account to){
    to.balance = to.balance + balance;
    balance = 0;
      System.out.println(STR."Balance has been transferred successfully.");
  }

  public void Transfer_V2(Account a){
    a.deposit(balance); // per er vitor je ache tar $ ke add kore debo
    balance = 0;
    System.out.println(STR."Balance has been transferred successfully.");
  }

  public String toString ()
  {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    //return (acctNumber + "\t" + name + "\t" + balance.NumberFormat.getCurrencyInstance());
    return ("Acc Number: " + acctNumber + "\t" + "Acc Name: " + name + "\t" + "Balance: " + fmt.format(balance));
  }
}

