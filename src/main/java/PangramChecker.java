import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PangramChecker {

    //my code
    public boolean check(String sentence) {

        sentence = sentence.toLowerCase();
        char[] charArr = sentence.toCharArray();
        TreeSet<Character> letterSet = new TreeSet<>();
        for (Character ch : charArr) {
            if (ch.toString().matches("[a-z]")) {
                letterSet.add(ch);
            }
        }

        return letterSet.first() == 'a' && letterSet.last() == 'z' && letterSet.size() == 26;

    }

    //mycode
    public boolean checkStream(String sentence) {

        sentence = sentence.toLowerCase();
        List<Character> letterSet = sentence.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> ch.toString().matches("[a-z]"))
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        return letterSet.get(0) == 'a'
                && letterSet.get(letterSet.size()-1) == 'z'
                && letterSet.size() == 26;
    }

    // Top CodeWars answer by 'Best Practices'
    public boolean checkCharFor(String sentence){
        for (char c = 'a'; c<='z'; c++)   // Iterating over chars , im guessing as their int value ?
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

    }
    // CodeWars more compact Stream than mine
    public boolean checkStreamIsAlphabetic(String sentence){
        return sentence.chars()
                .map(Character::toLowerCase)
                .filter(Character::isAlphabetic) // <-- notice method. In another example someone uses
                .distinct()                         // Character::isLetter
                .count() == 26;
    }
}
