public class RandomWord {
    private String randomWord;
    private int wordLength;
    private char[] letters;
    private Dictionary dictionary;
    public RandomWord (int wordLength, Dictionary dictionary) {
        this.dictionary = dictionary;
        this.wordLength = wordLength;
        randomWord = dictionary.getRandomWord();
        this.letters = randomWord.toCharArray();
    }
    public String compare(String guess) {
        if (guess.length() != randomWord.length() || dictionary.containsWord(guess)) {
            if (guess.length() != randomWord.length()) {
                return "This word has an incorrect length. Please try again";
            }
            if (dictionary.containsWord(guess)) {
                return "This word is not in the dictionary. Please try again.";
            }
        }
        return "im gay";
    }




}
