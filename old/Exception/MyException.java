package Exception;
public class MyException extends Exception
{
   //-----------------------------------------------------------------
   //  Sets up the exception object with a particular message.
   //-----------------------------------------------------------------
 MyException(String message)
   {
      super (message);
   }
 @Override
 public String getMessage(){
     return "MyException has been generated";
 }
}

