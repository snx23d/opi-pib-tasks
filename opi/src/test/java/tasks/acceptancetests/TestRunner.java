package tasks.acceptancetests;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static utils.utils.*;



public class TestRunner {
   public static void main(String[] args) {
      Class[] classes = {
         Task1Unit.class,
         Task2Unit.class
      };
      Result result = JUnitCore.runClasses(classes);
      
      for (Failure failure : result.getFailures()) {
         log("failures: " + failure.toString());
      }
      
      log("wasSuccessful: " + result.wasSuccessful());
   }
} 