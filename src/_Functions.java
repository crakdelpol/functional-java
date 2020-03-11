import java.util.function.BiFunction;
import java.util.function.Function;

public class _Functions {

    public static void main(String[] args) {

        String name = "matteo";
        String surname = "pipitone";

        System.out.println(capitalize.apply(name));

        System.out.println(addWelcome.apply(name));

        System.out.println(capitalizeAndWelcome.apply(name));

        System.out.println(capitalizeNameAndSurnameBiFunction.apply(name, surname));

        String matteoPipitone = welcomeAndCapitalizeNameAndSurnameBiFunction.apply(name, surname);

        System.out.println(matteoPipitone);

    }

    static Function<String, String> capitalize = s -> s.substring(0, 1).toUpperCase() + s.substring(1);

    static Function<String, String> addWelcome = s -> "Welcome " + s;

    static Function<String, String> capitalizeAndWelcome = capitalize.andThen(addWelcome);

    static BiFunction<String, String, String> capitalizeNameAndSurnameBiFunction = (s, s2) -> capitalize.apply(s) + " " + capitalize.apply(s2);

    static BiFunction<String, String, String> welcomeAndCapitalizeNameAndSurnameBiFunction = (s, s2) -> capitalizeNameAndSurnameBiFunction.andThen(capitalizeAndWelcome).apply(s, s2);
}
