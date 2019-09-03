// You are going to be given a word. Your job is to return the middle character of the word.
// If the word's length is odd, return the middle character.
// If the word's length is even, return the middle 2 characters.
// Kata.getMiddle("test") should return "es"
// Kata.getMiddle("testing") should return "t"

public class GetMiddle {
    public static String getMiddle(String word) {
        String result;
        if((word.length()%2) == 0 ){
            result = "" + word.charAt(word.length()/2-1) + word.charAt(word.length()/2);
        }else{
            result = "" + word.charAt(word.length()/2);
        }
        return result;
    }

    public static String getMiddleTernary(String word){
        return (word.length()%2 == 0
                ? "" + word.charAt(word.length()/2-1) + word.charAt(word.length()/2)
                : "" + word.charAt(word.length()/2));
    }

    public static String getMiddleCWTopAnswer(String word) {
        String s = "";
        int length = word.length();
        int half = length/2;

        if (length % 2 == 0) {
            s = word.substring(half - 1, half + 1);
        } else {
            s = word.substring(half, half + 1);
        }
        return s;
    }
}
