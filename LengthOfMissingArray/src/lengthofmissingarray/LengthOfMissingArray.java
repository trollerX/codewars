package lengthofmissingarray;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author TrollerX
 */
public class LengthOfMissingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[][] arr = {{1, 2}, {4, 5, 1, 1}, {1}, {null}, {}, {5, 6, 7, 8, 9}};
        System.out.println(getLengthOfMissingArray(arr));
    }

    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if (arrayOfArrays == null || arrayOfArrays.length == 0) {
            return 0;
        }
        
        for(Object[] arr : arrayOfArrays){
            if(arr == null || arr.length == 0){
                return 0;
            }
        }

        Arrays.sort(arrayOfArrays, new SortByLength());

        int length = 0;
        for (int i = 1; i < arrayOfArrays.length; i++) {
            if (arrayOfArrays[i].length - arrayOfArrays[i - 1].length > 1) {
                length = arrayOfArrays[i].length - 1;
            }
        }
        return length;
    }
}

class SortByLength implements Comparator<Object[]> {

    public int compare(Object[] a, Object[] b) {
        return a.length - b.length;
    }
}
