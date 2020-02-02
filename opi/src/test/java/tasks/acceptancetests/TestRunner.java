package tasks.acceptancetests;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static utils.utils.*;



public class TestRunner {

   private static final String ANSI_RED = "\u001B[31m";
   public static void main(String[] args) {
      Class[] classes = {
         Task1Unit.class,
         Task2Unit.class
      };
      Result result = JUnitCore.runClasses(classes);
      
      for (Failure failure : result.getFailures()) {
         log(
            "\n"+
            "************************************************************************************************************" +
            "\n"+
            ANSI_RED + "failures: " +
            failure.toString() +
            "\n" +
            "************************************************************************************************************" +
            "\n"
         );
      }
      
      log("wasSuccessful: " + result.wasSuccessful());
   }
} 