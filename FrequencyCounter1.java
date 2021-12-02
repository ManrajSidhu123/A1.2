import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random; 

/** ***************************************************
 *  Name:           Manraj 
 *  Class:          CS30S
 * 
 *  Assignment:     Part 1 of A1.5 
 * 
 *  Description:    1000 random numbers in a array
 * 
 *************************************************************/

public class FrequencyCounter1{

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    final int MAX = 1000; 
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        // array 
        int random = 0; 
        int array = 1000; 
        
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("Printing nuber.txt")));
    
        Random rnd = new Random(); 
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Manraj" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A1.5" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
      for(int i =  0; i < array; i++){
       // random number 
       random = rnd.nextInt(50) + 0; 
    
       // printing numbers disk file 
       fout.println(random); 
      }// end for loop  
      
    
    // ***** Main Processing *****
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        fout.close();
    } // end main 
    
} // end FormatTemplate
