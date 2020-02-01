package tasks.acceptancetests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static utils.utils.*;
import unitTest.TestedClass;
import static unitTest.Generator.getIntList;
import org.junit.Assert;


public class Task1 {

        // @BeforeClass
        // public static void ba(){
        //         utils.log("BeforeClass1");
        // }

        private ArrayList<Integer> emptyList;
        private ArrayList<Integer> allNumbersList;

        @Before
        public void startTest1(){
                utils.log("Executing Task1");
                this.emptyList = getIntList("all", 0);
                this.allNumbersList = getIntList("all", 10);


        }

        @Test
        public void fff() {
                utils.log("hhhhTask1");
        }

        public void fff1() {
                utils.log("hhhh11Task1");
        }

        @After
        public void hhh(){
                utils.log("Task1 finished");
        }

        
}