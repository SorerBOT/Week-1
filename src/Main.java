import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String expression = System.console().readLine("Enter expression: ").replaceAll("\\s", "");
        Pattern pattern = Pattern.compile("(\\d+)([+\\-*/^])(\\d+)");
        Matcher matcher = pattern.matcher(expression);
        if (!matcher.find())
            return;
        System.out.println(matcher.group(1) + "\n" + "\n" + matcher.group(3));
        switch (matcher.group(2)) {
            case "+":
                System.out.println("Evaluation Completed: "
                        + (Integer.parseInt(matcher.group(1)) + Integer.parseInt(matcher.group(3))));
                break;
            case "-":
                System.out.println("Evaluation Completed: "
                        + (Integer.parseInt(matcher.group(1)) - Integer.parseInt(matcher.group(3))));
                break;
            case "*":
                System.out.println("Evaluation Completed: "
                        + (Integer.parseInt(matcher.group(1)) * Integer.parseInt(matcher.group(3))));
                break;
            case "/":
                System.out.println("Evaluation Completed: "
                        + (Integer.parseInt(matcher.group(1)) / Integer.parseInt(matcher.group(3))));
                break;
            case "^":
                System.out.println("Evaluation Completed: "
                        + (int) Math.pow(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(3))));
                break;
        }
    }
}