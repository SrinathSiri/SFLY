package JavaPractice;

public class StringWordsReverse {

    public static void main(String[] args) {

        String text = "JAVA CODE";
        String twowords = "";

        String[] words = text.split(" ");

        for (String word : words) {
            String eachw = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                eachw = eachw + word.charAt(i);
            }
            twowords = twowords + eachw + " ";
        }

        System.out.println(twowords);
    }
}
