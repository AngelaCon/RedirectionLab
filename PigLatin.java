import java.util.*;
public class PigLatin {

    public static void main(String[] args) {
    //     String result = "";
    //     String[] words = {"mock", "pie", "david", "aaron", "the", "check", "skee", "emu", "grade", "*emu", "4chan", "fish!", "fish", "the.", "cat!", "amazing?", "apple%"};
    //     String[] correctWords = {"ockmay", "iepay", "avidday", "aaronhay", "ethay", "eckchay", "eeskay", "emuhay", "adegray", "*emu", "4chan", "ishfay!", "ishfay", "ethay.", "atcay!", "amazinghay?", "applehay%"};
    //     for (String word: words){
    //         for (String correctWord: correctWords) {
    //             if (pigLatinBest(word).equals(correctWord)) result = "all correct cutie";
    //             else {
    //                 result= "error at" + word;
    //             }
    //     }
    // }
    // System.out.println(result);


    Scanner n = new Scanner(System.in);
    //use hasNextLine()/nextLine() to loop over
    //all of the data
    while (n.hasNextLine()) {
        String x = n.nextLine();
        Scanner line = new Scanner(x);
        while (line.hasNext()) {
            String word = line.next();
            System.out.print(pigLatinBest(word));
            if (line.hasNext()){
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }
}





    public static String pigLatinSimple(String s){
       String newS = "";
        String lowS = s.toLowerCase();
        char first = lowS.charAt(0);
        if(first == 'a'|| first == 'e'|| first == 'i'|| first == 'o'||first == 'u'){
            newS = lowS + "hay";
        } else {
            newS = lowS.substring(1, lowS.length()) + lowS.charAt(0) + "ay";
        }
        return newS.toLowerCase();
    }

    public static String pigLatin(String s){
        s = s.toLowerCase();
        String output = "";
        String diagraphs[] = new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
        if(s.length() > 1){
            String first = s.substring(0,2);
            for (String digraph : diagraphs){
                if(first.equals(digraph)){
                    output = s.substring(2,s.length()) + first + "ay";
                }
            }
            if (output.equals("")) {
                output = pigLatinSimple(s);
                }
            }
        else {
            output = pigLatinSimple(s);
        }
        return output;
}

    public static String pigLatinBest(String s){

    String newS = "";
        char last = s.charAt(s.length()-1);
        if(!(Character.isLetter(s.charAt(0)))) newS = s;
         else if (!Character.isLetter(last) && !Character.isDigit(last)){
            String temp = s.substring(0, s.length()-1);
            newS = pigLatin(temp) + last;
        }else newS = pigLatin(s);
        return newS.toLowerCase();
    }


}
