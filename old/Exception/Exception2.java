package Exception;
class Exception2{
   static int sum(int num1, int num2){
      if (num1 == 0)
         throw new ArithmeticException("First parameter is not valid");
      else if (num2 == 0)
         throw new ArithmeticException("Second parameter is not valid");
      else
         System.out.println("Both parameters are correct!!");
      return num1+num2;
   }
   public static void main(String args[]){
      int res=sum(1,12);
      System.out.println(res);
      System.out.println("Continue Next statements");
   }
}