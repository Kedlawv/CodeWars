// In DNA strings, symbols "A" and "T" are complements of each other,
// as "C" and "G". You have function with one side of the DNA (string, except for Haskell);
// you need to get the other complementary side
// DnaStrand.makeComplement("ATTGC") // return "TAACG"
// DnaStrand.makeComplement("GTAT") // return "CATA"


public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder sb = new StringBuilder();
        for(char ch : dna.toCharArray()){
            sb.append(getComplement(ch));
        }
        return sb.toString();
    }

    public static String getComplement(char element){
        switch(element){
            case 'A':
                return "T";
            case 'T':
                return "A";
            case 'C':
                return "G";
            case 'G':
                return "C";
            default :
                return "error";
        }
    }
}
