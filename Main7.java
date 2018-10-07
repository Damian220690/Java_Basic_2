package b_Zadania_Domowe.a_Dzien_2;

//W pliku `Main7.java` umieść metodę o sygnaturze `static String censor(String str, String[] words)`.
//
//1. Metoda:
//
//* rozbije łańcuch tekstowy na tablicę wyrazów,
//* sprawdzi, czy nie znajdują się w nim słowa niedozwolone zawarte w tablicy `words`,
//* jeśli tak -- zamieni je na cztery gwiazdki (****)
//* ponownie połączy tablicę w string i zwróci wartość.

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main7 {

    public static void main(String[] args) {
        String[] words = {"under", "illegal","around"};
        String str = "Indonesia is the 5th biggest producer of tobacco. Hiring children under 15 years of age " +
                "in Indonesia is illegal but around 2 million children work in Indonesia’s agriculture.";
        censor(str, words);
    }

    static String censor(String str, String[] words) {
        StringTokenizer strToken = new StringTokenizer(str, ":,. ");
        int numberOfTokens = strToken.countTokens();
        String[] strWords = new String[numberOfTokens];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfTokens; i++) {
            strWords[i] = strToken.nextToken();
            for (int j = 0; j < words.length; j++) {
                if (strWords[i].equals(words[j])){
                    strWords[i] = "****";
                }
            }
            sb.append(strWords[i]+" ");
        }
        System.out.println(sb);
        return "a";
    }
}
