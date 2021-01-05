public class Tester {
    public static void main(String[] args) {
        String result = "";
        String[] words = {"mock", "pie", "david", "aaron", "the", "check", "skee", "emu", "grade", "*emu", "4chan", "fish!", "fish", "the.", "cat!", "amazing?", "apple%"};
        String[] correctWords = {"ockmay", "iepay", "avidday", "aaronhay", "ethay", "eckchay", "eeskay", "emuhay", "adegray", "*emu", "4chan", "ishfay!", "ishfay", "ethay.", "atcay!", "amazinghay?", "applehay%"};
        for (String word: words){
            for (String correctWord: correctWords) {
                if (pigLatinBest(word).equals(correctWord)) result = "all correct cutie";
                else {
                    result= "error at" + word;
                }
        }
    }
    System.out.println(result);
}
}
