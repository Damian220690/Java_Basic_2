package b_Zadania_Domowe.a_Dzien_2;

//W pliku `Main3.java` umieść  metodę  o sygnaturze `static String upperCase(String str, int index)` .
//
//1. Metoda zwraca napis `str`, w którym znaki zostały zamienione na duże z pozycji podzielnych przez `index`

public class Main3 {

    public static void main(String[] args) {
        System.out.println(upperCase("Damian", 3));
    }

    static String upperCase(String str, int index) {
        StringBuilder sb = new StringBuilder();
        String modifiedStr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                ch = str.charAt(i);
                ch = Character.toLowerCase(ch);
            } else {
//                System.out.println(str.length() + " : " + i + " = " +str.length() % i);
                ch = str.charAt(i);
                if (str.length() % i == 0) {
                    ch = Character.toUpperCase(ch);
                }
            }
            modifiedStr += Character.toString(ch);
            sb.append(modifiedStr);
        }
        return modifiedStr;
    }

}
