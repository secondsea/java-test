import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Interview {
    public static void main(String args[]) throws ParseException {
        
        ArrayList<String> capped = new ArrayList<String>();
        Map<String, List<String>> Canidates = new HashMap<String, List<String>>();
        Calendar baseDate = Calendar.getInstance();
        baseDate.set(1990,Calendar.APRIL,6,0,0);
        Calendar birthDate = Calendar.getInstance();
        Calendar today= Calendar.getInstance();
        String Canidate;
         int workYears;
          int yob;
          int age;
          String birthYear;
          String ageString;
          SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
          
          
          
          
          
        capped.add("MARY");
        capped.add("JOE");
        capped.add("SIENNA");
        capped.add("PETE");
        
        
        
 	for (int i = 0; i < capped.size(); i++) {
             List<String> canData = new ArrayList<String>();
             Canidate = (capped.get(i));
             String properName=firstLetterCaps(Canidate);
             canData.add(properName);
             
             workYears = (properName.length());
             birthDate.setTimeInMillis(baseDate.getTimeInMillis());
             birthDate.add(Calendar.YEAR, - workYears);  
             yob=birthDate.get(Calendar.YEAR);
             birthYear=Integer.toString(yob);
             canData.add(birthYear);
     
             
             age =today.get(Calendar.YEAR) - yob;
             ageString = Integer.toString(age);
             canData.add(ageString);
                                        
             Canidates.put(Canidate, canData);
                    
       }
        
  System.out.println("The Canidates are:");
                
  for (Map.Entry<String, List<String>> entry : Canidates.entrySet()) { 
        String key = entry.getKey();
          List<String> values = entry.getValue();
     //   System.out.println("Key = " + key);
        System.out.println(values.get(0)    + " was born in "+ values.get(1) + " and is " + values.get(2) + "years old.");
              // System.out.println(values.get(0));
              
               // System.out.println(values.get(1));
               // System.out.println(values.get(2));
                
                
                
                
        }         
                
                
                
                
                
                
                
                
                
                
                
                
                
                
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
     static public String firstLetterCaps ( String data )
  {
      String firstLetter = data.substring(0,1).toUpperCase();
      String restLetters = data.substring(1).toLowerCase();
      return firstLetter + restLetters;
  }
    
    


}