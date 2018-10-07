package b_Zadania_Domowe.a_Dzien_2;

//W pliku `Main5.java` umieść metodę o sygnaturze `static String replaceChar(String str, char forReplace,
// char replacement)`.
//
//1. Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie `str`
// wszystkich zmaków `forReplace` przez znaki `replacement`.

public class Main5 {

    public static void main(String[] args) {
        System.out.println(replaceChar("aabbaa",'a','d'));
    }

    private static String replaceChar(String str, char forReplace, char replacement){
        String replaceAllText = str.replace(forReplace, replacement);
        return  replaceAllText;
    }
}
