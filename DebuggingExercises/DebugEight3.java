// Application looks up home price
// for different floor plans
// allows upper or lowercase data entry
import javax.swing.*;
public class DebugEight3
{
   public static void main(String[] args)
   { 
      String entry;
      char[] floorPlans = {'A','B','C','a','b','c'};
      int[] pricesInThousands = {145, 190, 235};
      char plan;
      int fp = 99;
      String prompt = """
          Please select a floor plan
          Our floorPlans are:
          A - Augusta, a ranch
          B - Brittany, a split level
          C - Colonial, a two-story
          Enter floorPlans letter""";
      entry = JOptionPane.showInputDialog(null, prompt);
      plan = entry.charAt(0);
      for(int x = 0; x < floorPlans.length; ++x) {
          if (plan == floorPlans[x]) {
              fp = x;
          }
      }

     if(fp == 99) {
        JOptionPane.showMessageDialog(null,
            "Invalid floor plan code entered");
      }
     else {
       if(fp > 2) {
           fp = fp - 3;
       }
       JOptionPane.showMessageDialog(null, "Model " +
          floorPlans[fp] + " is priced at only $" +
          pricesInThousands[fp] + ",000");
     }

   }
}

