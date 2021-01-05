public class PigLatin {

    public static String pigLatinSimple(String s){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        result = "";
        for (int i = 0; i < vowels.length; i++) {
            if (s.charAt(0) == vowels[i]) {
                result = s + "hay"
            }
            else {
                result = s.substring(1, s.length+1) + s.charAt(0) + "ay";
            }
        }
        return result;
    }

    public static String pigLatin(String s){


    }

}
