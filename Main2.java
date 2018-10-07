package b_Zadania_Domowe.a_Dzien_2;


import java.util.Arrays;

public class Main2 {
    static char[] alphabet = {'a', 'ą', 'b', 'c', 'ć', 'd', 'e', 'ę', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'ł', 'm', 'n',
            'ń', 'o', 'ó', 'p', 'r', 's', 'ś', 't', 'u', 'w', 'y', 'z', 'ź', 'ż'};

    public static void main(String[] args) {
        String someWord = "ewelina";
        String wordInCezarCode = encode(someWord, 3);
        String primaryWord = decode(wordInCezarCode, 3);
        System.out.println("Our word in Cezar code with our shift " + wordInCezarCode);
        System.out.println("Our coded word is " + primaryWord);
    }

    static String encode(String str, int shift) {
        StringBuilder sb = new StringBuilder();
        char[] wordChars = new char[str.length()];
        int[] index = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            wordChars[i] = str.charAt(i);
            for (int j = 0; j < alphabet.length; j++) {
                if (wordChars[i] == alphabet[j]) {
                    index[i] = j + shift;
                    if (index[i] > 32) {
                        index[i] = index[i] - 32;
                    }
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            wordChars[i] = alphabet[index[i]];
            sb.append(wordChars[i]);
        }
        return sb.toString();
    }

    static String decode(String str, int shift){
        StringBuilder sb = new StringBuilder();
        char[] wordChars = new char[str.length()];
        int[] index = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            wordChars[i] = str.charAt(i);
            for (int j = 0; j < alphabet.length; j++) {
                if (wordChars[i] == alphabet[j]) {
                    index[i] = j - shift;
                    if (index[i] < 0) {
                        index[i] = index[i] + 32;
                    }
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            wordChars[i] = alphabet[index[i]];
            sb.append(wordChars[i]);
        }
        return sb.toString();
    }

}
