package javaworkbook;
import java.util.Scanner;
import workbook.StepA.StepAManager;
import workbook.StepB.StepBManager;
import workbook.StepC.StepCManager;
import workbook.StepD.StepDManager;
import workbook.StepE.StepEManager;
import workbook.StepF.StepFManager;
import workbook.StepG.StepGManager;
import workbook.StepH.StepHManager;
import workbook.StepI.StepIManager;
import workbook.StepJ.StepJManager;
import workbook.StepK.StepKManager;
import workbook.StepL.StepLManager;
import java.text.ParseException;


public class WBManager {

   public static void main(String[] args) throws ParseException {
      // TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      System.out.print("원하는 Step은?");
      String step = s.next();
      if(step.equalsIgnoreCase("A")) {
        new StepAManager();
      	System.out.printf("종료되었습니다.\n");
      }
      else if(step.equalsIgnoreCase("B")) {
    	  new StepBManager();
        	System.out.printf("종료되었습니다.\n");
    	  
      }
      else if(step.equalsIgnoreCase("C")) {
    	  new StepCManager();
        	System.out.printf("종료되었습니다.\n");
    	  
      }
      else if(step.equalsIgnoreCase("D")) {
    	  new StepDManager();
        	System.out.printf("종료되었습니다.\n");
    	  
      }
      else if(step.equalsIgnoreCase("E")) {
    	  new StepEManager();
        	System.out.printf("종료되었습니다.\n");
    	  
      }
      else if(step.equalsIgnoreCase("F")) {
    	  new StepFManager();
        	System.out.printf("종료되었습니다.\n");
    	  
      }
      else if(step.equalsIgnoreCase("G")) {
    	  new StepGManager();
        	System.out.printf("종료되었습니다.\n");
    	  
      }
      else if(step.equalsIgnoreCase("H")) {
    	  new StepHManager();
        	System.out.printf("종료되었습니다.\n");
    	  
      }
      else if(step.equalsIgnoreCase("I")) {
    	  new StepIManager();
        	System.out.printf("종료되었습니다.\n");
    	  
      }
      
      else if(step.equalsIgnoreCase("J")) {
    	  new StepJManager();
        	System.out.printf("종료되었습니다.\n");
    	  
      }
      
      else if(step.equalsIgnoreCase("K")) {
    	  new StepKManager();
        	System.out.printf("종료되었습니다.\n");
    	  
      }
      
      else if(step.equalsIgnoreCase("L")) {
    	  	new StepLManager();
        	System.out.printf("종료되었습니다.\n");
    	  
      }
      
      
   }   
}