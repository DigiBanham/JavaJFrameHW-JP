// Required Libraries 
import java.io.*;
import javax.swing.JOptionPane;

//Start of the class FileManagement
public class JavaJFrameJP
{
         //Executable: Main method:
         public static void main(String[] args)
        {
              //Input Section:
              /*ADD YOUR INPUT PROMPTS HERE*/        
              try{
                 BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
                 String sentence = JOptionPane.showInputDialog("Write a sentence");
                 writer.write(sentence);
                 writer.close();
              } catch (IOException e){
              e.printStackTrace();
              }
              
              //Reading and Outputting from file
              try{
                  BufferedReader reader = new BufferedReader(new FileReader ("output.txt"));
                  JOptionPane.showMessageDialog(null, reader.readLine(), "Title", JOptionPane.INFORMATION_MESSAGE);             
              } catch (IOException e){
                e.printStackTrace();
              }
        }  
}