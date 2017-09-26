/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and varifirstStringbles
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/*
 * * finding the largest substring that is common between
 * @param firstString is the first
 * @param secondString is the second
 * @param third String is used to switch values around.
 * @param largestString is the largest common substring
 * @ return largestString
 *
 */

public class ReclamationProject
{
    static String doit(String firstString,String secondString) {
        String thirdString = "";
        if (firstString.length() > secondString.length()) {
            thirdString = firstString; // TODO: set c to a
            firstString = secondString;
            secondString = thirdString; }
        String largestString = "";


        /*
         * For loop with i
         */
        for (int i = 0; i < firstString.length(); i++) {
            for (int j = firstString.length() - i; j > 0; j--) {
                for (int k = 0; k < secondString.length()- j; k++) {
                    if ((firstString.regionMatches(i, secondString, k, j) && j > largestString.length())) {
                        largestString = firstString.substring(i,i + j);
                    }
                        }
                }
        }
        return largestString;
        }
}
