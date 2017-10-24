package findmissingletter;

/**
 * @author TrollerX
 */
public class FindMissingLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char[] letters = {'a', 'b', 'c', 'd', 'f'};
        char[] letters2 = {'O', 'Q', 'R', 'S'};
        char[] letters3 = {'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K'};
        System.out.println(findMissingLetter(letters));
        System.out.println(findMissingLetter(letters2));
        System.out.println(findMissingLetter(letters3));
    }

    public static char findMissingLetter(char[] array) {

       /* boolean stop = false;
        int i;
        for(i = 1; i < array.length && !stop; i++)
        {
            if (array[i] - array[i-1] != 1)
                stop = true;
        }
        return (char) (array[i-1]-1);*/

        boolean upper = false;
        if (Character.isUpperCase(array[0])) {
            upper = true;
            for (int i = 0; i < array.length; i++) {
                array[i] = Character.toLowerCase(array[i]);
            }
        }

        String letters = "abcdefghijklmnopqrstuvwxyz";
        char missingLetter = '\0';
        char start = array[0];
        int positionInString = letters.indexOf(start);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != letters.charAt(positionInString + i)) {
                missingLetter = letters.charAt(positionInString + i);
                break;
            }
        }
        if (upper) {
            missingLetter = Character.toUpperCase(missingLetter);
        }
        return missingLetter;
    }

}
