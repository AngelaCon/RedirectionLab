public class PigLatin {

    public static void main(String[] args) {
        String[] words = {"mock", "pie", "david", "aaron", "the", "check", "skee", "emu", "grade"};
        for (String word: words){
            System.out.println(pigLatin(word));
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

}
