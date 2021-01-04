import java.util.*;
public class MakeStars {
    public static void main( String[]args ){
    Scanner n = new Scanner(System.in);
    //use hasNextLine()/nextLine() to loop over
    //all of the data
    while (n.hasNextLine()) {
        String line = n.nextLine();
        Scanner newLine = new Scanner(line);
        String addHere = "";
        while (newLine.hasNext()) {
            String word = newLine.next();
            for (int i = 0; i < word.length(); i++) {
                addHere += "*";
            }
            if (newLine.hasNext()) {
                addHere += " ";
            }


        }
        System.out.println(addHere);
    }

}
}
