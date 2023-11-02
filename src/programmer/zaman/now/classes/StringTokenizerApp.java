package programmer.zaman.now.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {

        String value = "Hanif Faiz Hidayat";

        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while (tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}

//Lebih hemat memori