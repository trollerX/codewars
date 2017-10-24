package finduniquenumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author TrollerX
 */
public class FindUniqueNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double uniq = findUniq(new double[]{0, 0, 0.55, 0, 0});
        System.out.println(uniq);
    }

    public static double findUniq(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }
}
