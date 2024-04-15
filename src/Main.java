import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        Locale locale_ru_RU = new Locale("ru", "RU");

        ResourceBundle resourceBundle = ResourceBundle.getBundle("labels", locale_ru_RU);

        System.out.println(resourceBundle.getString("hello"));
    }
}
