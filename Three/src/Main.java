import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // List.of för att listan inte ska kunna ändras så blir det lite mer thread safe.
        List<String> words = List.of("stout", "cat", "point", "dog", "football", "amplifier", "fish", "concatenate", "css", "html", "Lidls");

        var nounFilter = Pattern
                .compile("[aeuioy][^ ]*[aeuioy].?")
                .asPredicate();

        var nouns = words.stream().filter(nounFilter).toList();
        System.out.println(nouns);

    }
}
