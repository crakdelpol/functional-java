import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println("let's start with SUPPLIER");

        System.out.println(getConfiguration());
        System.out.println(getConfigurationSupplier.get());
        System.out.println(getConfigurationsSupplier.get());
    }

    static String getConfiguration(){
        return "configuration";
    }

    static Supplier<String> getConfigurationSupplier = () -> "configuration";
    static Supplier<List<String>> getConfigurationsSupplier = () -> List.of("configuration","configuration2");
}
