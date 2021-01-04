import java.util.*;
public class MakeStars {
    public static void main( String[]args ){
    Scanner n = new Scanner(System.in);
    //use hasNextLine()/nextLine() to loop over
    //all of the data
    while (n.hasNextLine()) {
        String line = n.nextLine();
        Scanner newLine = new Scanner(line);
        while (newLine.hasNextLine()) {
            String word = newLine.nextLine();
            for (int i = 0; i < word.length(); i++) {
                System.out.println('*');
            }
        }
    }
}
}
