import java.util.ArrayList;
public class Permutation {
    String word;
    public Permutation(String s) {
        word = s;
        String[] combos = establishAllCombos(word);
        for (String combo : combos) {
            System.out.println(combo);
        }
    }
    public String establishAllCombos(String newWord, String word) {
        // get all letters
        String[] letters = word.split("");
        if (letters.length == 1){
            return newWord;
        }
        String[] combos = new String[letters.length];
        for(int i = 0; i < letters.length; i++) {
            String otherLetters = "";
            for(int j = 0; j < letters.length; j++) {
                if (j != i) {
                    newWord+=letters[i];
                    otherLetters += letters[j];
                }
            }
            String others = establishAllCombos(newWord, otherLetters);
            for (String other : others) {
                combos[i] = letters[i] + other;
            }
        }
        return combos;
    }

    
}
