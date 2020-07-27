import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args){
  CreateFile myObj1 = new CreateFile();
    
    WriteToFile myObj2 = new WriteToFile();

    ReadFile myObj3 = new ReadFile();

    candy myfavcandy = new candy ();
    myfavcandy.website();
    System.out.println(myfavcandy.brand + " " + myfavcandy.modelName);
    System.out.println("This is my inheritance and polymorphism");
    
  }
}

class food {
  protected String brand = "Mars";
  public void website() {
    System.out.println("http://www.mars.com/");
  }
}
class candy extends food {
  public String modelName = "M%M'S";
  
  
}
class WriteToFile {
   {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("This was a pretty great class and i hope you have a great summer :)");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
 class ReadFile {
   {
    try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        System.out.println("What is in the file: ");
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}