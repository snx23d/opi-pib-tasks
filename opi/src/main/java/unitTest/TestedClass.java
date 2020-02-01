package unitTest;

import java.util.ArrayList;
import java.util.Iterator;

public class TestedClass {

    /**
     * Tested method that returns Integer list with odd values only
     */
    static ArrayList<Integer> testMe(ArrayList<Integer> list){

        ArrayList<Integer> outputList = new ArrayList<Integer>();
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer listElement = iterator.next();
            int value = listElement.intValue();
            
            if (value % 2 == 1) {
                outputList.add(value);
            }
        }

        return outputList;
    }
}