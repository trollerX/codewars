/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpbookseller;

/**
 *
 * @author TrollerX
 */
public class HelpBookseller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[]{"A", "B"};
        System.out.println(stockSummary(art, cd));
    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        // your code here
        if(lstOfArt.length == 0 || lstOf1stLetter.length == 0){
            return "";
        }
        StringBuilder str = new StringBuilder();
        for (String letter : lstOf1stLetter) {
            if (str.length() != 0) {
                str.append(" - ");
            }
            int sum = 0;
            for (String string : lstOfArt) {
                if (Character.toString(string.charAt(0)).equals(letter)) {
                    sum += Integer.parseInt(string.substring(string.lastIndexOf(' ') + 1));
                }
            }
            str.append("(" + letter + " : " + sum + ")");
        }
        return str.toString();
    }

}
