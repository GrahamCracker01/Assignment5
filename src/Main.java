//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

public class Main {

    //reverse method
    public static String reverse(String word) {
        char[] inputArray = word.toCharArray();
        char[] outputArray = new char[word.length()];
        for (int i = 0; i < inputArray.length; i++) {
            int j = ((inputArray.length - 1) - i);
            outputArray[j] = inputArray[i];
        }
        return new String(outputArray);
    }

    //v to ^ and vice versa
    public static String convert(String word) {
        word = word.replace('v', 'a');
        word = word.replace('^', 'v');
        word = word.replace('a', '^');
        return word;
    }

    public static String paperfold (int i) {
        if ( i == 1) {
            return "v";
        }
        else {
            i--;
            return (convert(reverse(paperfold(i))) + "v" + paperfold(i));
        }
    }

    public static void main (String[]args){
        for (int i = 1; i < 10; i++) {
            String fold_string = paperfold(i);
            System.out.println("For " + i + " folds we get: " + fold_string + "\n");
        }
    }
}