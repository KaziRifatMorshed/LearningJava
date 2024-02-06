package account;
public class TestAccount {
  
  
  public static void main(String[] args) { 
    Account a1 = new Account("Su Mon",1,1111);
    Account a2 = new Account("Mohi Ma",2,2222);
    Account a3 = new Account("Mur Taza",3, 1234);
    
    a1.deposit(1000);
    a2.withdraw(1000);
    //a1.Transfer(a2);
    a1.Transfer_V2(a2);
    
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
