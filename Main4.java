package b_Zadania_Domowe.a_Dzien_2;

//W pliku `Main4.java` umieść  metodę  o sygnaturze `static int tripple(String str)`
//1. Metoda zwraca ilość potrójnych wystąpień znaków w napisie
//Przykład dla qazbbbwsx -> 1, dla aaawsxbbb ->2

public class Main4 {

        public static void main(String[] args) {
            tripple("Damian");
        }

        static int tripple(String str){
            char[] charArray = str.toCharArray();
            int counter = 0;
            for(int i = 0; i < str.length(); i++){
                if(charArray[i] == charArray[i+1] && charArray[i+1] == charArray[i+2]){
                    counter++;
                }
            }
            return counter;
        }
}
