import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Manraj
 *  Class:          CS30S
 * 
 *  Assignment:     Part 2 of A1.5 
 * 
 *  Description:    Count frequency of numbers from 1-50 from random array
 * 
 *************************************************************/

public class FrequencyCounter2{

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    final int SIZE = 1000; 

    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        BufferedReader fin = null;       // input buffer 
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        // variables 
        
        int[] NArray = new int[SIZE]; 
        
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        try{
           fin = new BufferedReader(new FileReader("RandomNumbers.txt"));
        }// end try 
        catch(FileNotFoundException e){
           System.out.println("File not found"); 
          fin = null; 
        }// end catch
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Manraj" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A1.5 Part 2" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****

    // ***** Main Processing *****

    
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
