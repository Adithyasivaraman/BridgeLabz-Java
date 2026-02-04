import java.util.regex.*;

class LinkExtractor {

    public static void main(String[] args) {

        String text =
                "Visit https://www.google.com and http://example.org for info.";

        String regex = "https?://[\\w.-]+";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
