package convertstringtocamelcase;

import java.lang.StringBuilder;

/**
 *
 * @author TrollerX
 */
public class ConvertStringToCamelCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
        System.out.println(toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields"));
    }

    static String toCamelCase(String s) {
        if (s.isEmpty()) {
            return "";
        }
        StringBuilder str = new StringBuilder().append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (Character.valueOf(s.charAt(i - 1)).equals('-') || Character.valueOf(s.charAt(i - 1)).equals('_')) {
                str.append(Character.toUpperCase(s.charAt(i)));
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString().replaceAll("[-_]", "");
    }

}
