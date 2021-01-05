import java.util.*;
public class RedirectionDemo{

      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner(System.in);
      //use hasNextLine()/nextLine() to loop over
      //all of the data
      while (n.hasNextLine()) {
          String line = n.nextLine();
          Scanner newLine = new Scanner(line);
          while (newLine.hasNextLine()) {
              String word = newLine.nextLine();
              System.out.println(word);
          }
      }
      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }
}
