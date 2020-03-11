import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("Let's start with Predicate");
        String phoneNumberWithout0 = "12312321312";
        String phoneNumberLength12 = "012312321311";
        String phoneNumberValid = "01231232131";
        System.out.println(isPhoneNumberValid(phoneNumberWithout0));
        System.out.println(isPhoneNumberValid(phoneNumberLength12));
        System.out.println(isPhoneNumberValid(phoneNumberValid));
        System.out.println("with predicate");
        System.out.println(isPhoneNumberValidPredicate.test(phoneNumberWithout0));
        System.out.println(isPhoneNumberValidPredicate.test(phoneNumberLength12));
        System.out.println(isPhoneNumberValidPredicate.test(phoneNumberValid));

        System.out.println("is number valid and contains number 3");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumberThree).test(phoneNumberValid));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumberThree).test("01201202101"));
        System.out.println("is number valid or contains number 3");
        System.out.println(isPhoneNumberValidPredicate.or(containsNumberThree).test("01201202101"));
        System.out.println("Has name and surname");
        System.out.println(hasNameAndSurname.test("name", "surname"));
        System.out.println(hasNameAndSurname.test("name", ""));
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("01") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("01") && phoneNumber.length() == 11;

    static Predicate<String> containsNumberThree = phoneNumber -> phoneNumber.contains("3");

    static BiPredicate<String, String> hasNameAndSurname = (s, b) -> s.length() > 0 && b.length() > 0;

}
