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
            if (word.length() >= 2) word = pigLatinBest(word);
            System.out.println(word);
        }

    }

}



    public static String pigLatinSimple(String s){
        s = s.toLowerCase();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String result = "";
        for (int i = 0; i < vowels.length; i++) {
            if (s.charAt(0) == vowels[i]) {
                result = s + "hay";
            }
        }

        if (result == "") result = s.substring(1, s.length()) + s.charAt(0) + "ay";
        return result;
    }

    public static String pigLatin(String s){
        s = s.toLowerCase();
        String output = "";
        String[] diagraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
        for (int i = 0; i < diagraphs.length; i++) {
            if (s.substring(0,2).equals(diagraphs[i])) {
                output = s.substring(2,s.length()) + s.substring(0,2) + "ay";
            }
        }
        if (output == "") output = pigLatinSimple(s);
        return output;
    }

    public static String pigLatinBest(String s){
        s = s.toLowerCase();
        String result = "";
        char firstLetter = s.charAt(0);
        char lastLetter = s.charAt(s.length()-1);
        if (!(Character.isLetter(firstLetter))) result = s;
        else if (!(Character.isLetter(lastLetter)) && !(Character.isDigit(lastLetter))) {
            result += pigLatin(s.substring(0,s.length()-1)) + lastLetter;
        }
        else {
            result += pigLatin(s);
        }
        return result;
    }


}
