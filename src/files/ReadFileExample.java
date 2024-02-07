package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;  

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {

 public static void main(String[] args) throws IOException {
  BufferedReader objReader = null;
  try {
   String strCurrentLine;
   File f = new File ("F:/eclipseworklocationdntdelete/DukesDiary1.txt");
   File f1 = new File ("F:/eclipseworklocationdntdelete");
   for(int i=0;i<f1.list().length;i++) {
	   System.out.println(f1.list()[i]); 
   }
 
   f.createNewFile();
   objReader = new BufferedReader(new FileReader("F:/eclipseworklocationdntdelete/DukesDiary1.txt"));
   int i=1;
   while ((strCurrentLine = objReader.readLine()) != null) {

    System.out.println(strCurrentLine);
    System.out.println("\n\n"+i++);
   }

  } catch (IOException e) {

   e.printStackTrace();

  } finally {

   try {
    if (objReader != null)
     objReader.close();
   } catch (IOException ex) {
    ex.printStackTrace();
   }
 
 
}
}}