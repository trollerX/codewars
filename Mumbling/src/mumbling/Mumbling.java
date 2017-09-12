/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mumbling;

/**
 *
 * @author TrollerX
 */
public class Mumbling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(accum("MjtkuBovqrU"));
    }

    public static String accum(String str) {
        char[] letters = str.toCharArray();
        String accum = "";
        for (int i = 0; i < letters.length; i++, accum += "-") {
            accum += Character.toUpperCase(letters[i]);
            for (int j = 1; j <= i; j++) {
                accum += Character.toLowerCase(letters[i]);
            }
        }
        return accum.substring(0, accum.length() - 1);
    }

}
