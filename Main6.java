package b_Zadania_Domowe.a_Dzien_2;

//W pliku `Main6.java` umieść metodę o sygnaturze `static String replaceStr(String str, String forReplace,
// String replacement)`.
//
//1. Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie `str`
// wszystkich wystąpień napisu `forReplace` przez napis `replacement`.

public class Main6 {

    public static void main(String[] args) {
        System.out.println(replaceStr("auwwau", "au", "yyyy"));
    }

    private static String replaceStr(String str, String forReplace, String replacement){
        String replaceAllText = str.replaceAll(forReplace, replacement);
        return replaceAllText;
    }

}
