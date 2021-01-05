public class PigLatin {

    public static void main(String[] args) {
        String[] words = {"mock", "pie", "david", "aaron"};
        for (String word: words){
            System.out.println(pigLatinSimple(word));
        }

    }

    public static String pigLatinSimple(String s){
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

    // public static String pigLatin(String s){
    //
    //
    // }

}
