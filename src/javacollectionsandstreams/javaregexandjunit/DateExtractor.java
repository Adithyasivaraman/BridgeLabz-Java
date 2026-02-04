import java.util.regex.*;

class DateExtractor {

    public static void main(String[] args) {

        String text =
                "Events: 12/05/2023, 15/08/2024, 29/02/2020.";

        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
