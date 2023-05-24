import java.util.*;
public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = addAAtThirdWord(input);
        System.out.println("Modified string: " + result);
    }
    public static String addAAtThirdWord(String input) {
        String[] words = input.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            builder.append(words[i]);
            if ((i + 1) % 3 == 0) {
                builder.append("A ");
            } else {
                builder.append(" ");
            }
        }

        return builder.toString().trim();
    }
}
