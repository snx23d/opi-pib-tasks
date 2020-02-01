package unitTest;

import java.util.ArrayList;



public class Generator {

    /**
     * Creates a list of Integers
     * @param modifier allowed values: "even" "odd" "all"
     * @param length list length
     * @throws ArrayIndexOutOfBoundsException
     */
    public static ArrayList<Integer> getIntList(String modifier, int length) {

        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException("getIntList: length cannot be less than 0");
        }

        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        for (int i = 0; i < length; i++) {
            if (modifier == "even") {
                intList.add(2 * i);
            }

            if (modifier == "odd") {
                intList.add(2 * i + 1);
            }

            if (modifier == "all") {
                intList.add(i);
            }
        }

        return intList;
    }

}