import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Fail2Ban {

    public static void main(String[] args) throws FileNotFoundException {
       
    //declares + initializes Scanner, PrintWriter, ArrayList, & Variables
    Scanner in = new Scanner(new File(args[0]));
    PrintWriter out = new PrintWriter(args[1]);   
    ArrayList<String> invalid = new ArrayList<String>();
    int counter; //counts number of invalid logins
                             
    //reads user input + extract IP Address if invalid + places in array
    while (in.hasNextLine()) {
        String [] input = in.nextLine().split(" ");
            if (input[5].equals("Invalid")) {
               invalid.add(input[9]);// = input[9];                
               } 
    }
    
    //creates ArrayList for Invalid IPs that show up more than 3 times    
     ArrayList <String> moreThanThree = new ArrayList<String>();    
     for(int i=0; i<invalid.size();i++) {
         if(moreThanThree.contains(invalid.get(i))) {
             continue;
         }
         //invalid[i] (this is the IP we are searching for)
         counter = 0;
       for(int j = 1; j<invalid.size();j++) {
             if(invalid.get(i).equals(invalid.get(j))){
               counter++;       
             }           
         }
         if (counter >= 3){
             moreThanThree.add(invalid.get(i));             
         }
         
   }  
        
   //prints on output file   
   out.println("There are " + moreThanThree.size() + " IP addresses that are invalid more than 3 times.");
   for(String a: moreThanThree) {
       out.println(a);
   }
  out.close();      
   
   }  
}
             
