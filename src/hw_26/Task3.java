package hw_26;

import homework_26.MethodAbbreviation;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println(phraseString());
    }


    public static String phraseString() {

        Scanner sc= new Scanner(System.in);
        System.out.println("Введите строку из несколько слов: ");

        // trim() - убирает пробелы в начале и конце строки, если они есть

        // "    Hel  v   lo    "
        //String example = "    Hel  v   lo    ";
        //System.out.println(example.trim());

        String input = sc.nextLine().trim();

        if (input.isEmpty()) return "";

        //String[] words = input.split(" ");
        //   \\s - пробельный символ, + говорит в количестве от 1 и больше; " ", "    ", "  "
        String[] words = input.split("\\s+");
        System.out.println(Arrays.toString(words));

        //String result = "";
        StringBuilder sb= new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() ==0) continue;
            //result += word.charAt(0);
            sb.append(word.charAt(0));
        }

        return  sb.toString().toUpperCase();
        // sd gg      ggg gg
    }


}
