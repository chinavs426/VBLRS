//JAVA Exceptions::://Try, Catch, Throws, except, thrown
// INPUT STREAMS 
import java.io.*;
public class ReadByteByByteDemo{
  public static void main(String[] args) throws Exception{

    //Step1: Create a sample file
    FileOutputStream fos = new FileOutputStream("data.txt");
    String text = "my college is Institute of Aeronautical Engineering";
    fos.write(text.getBytes());
    fos.close();

    //Step2: Open the file for reading

    InputStream is = new FileInputStream("data.txt");

    //Step3: Read the first byte
    int i = is.read();

    //Step4: Read until the end of file(-1 means no more data)
    while(i != -1){

      //Print byte value and its corresponding character
      System.out.println(i + " => " + (char)i);

      //Read next byte
      i = is.read();
    }
    is.close();
    System.out.println("File reading completed successfully!");
  }
}