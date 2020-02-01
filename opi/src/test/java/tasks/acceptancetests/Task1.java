package tasks.acceptancetests;

import org.junit.After;
import org.junit.Before;
// import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
// import java.util.Iterator;

import static utils.utils.*;
import unitTest.TestedClass;
import  unitTest.Generator;
import org.junit.Assert;


public class Task1 {

    // @BeforeClass
    // public static void ba(){
    //     log("BeforeClass1");
    // }

    private ArrayList<Integer> emptyList;
    private ArrayList<Integer> integersList;

    @Before
    public void startTest1(){
        log("Executing Task1");
        this.emptyList = Generator.getIntList("all", 0);
        this.integersList = Generator.getIntList("all", 10);
    }

    @Test
    public void testWithEmpty() {
        log("Testing method with empty list");
        ArrayList<Integer> results = TestedClass.testMe(emptyList);
        Assert.assertEquals(new ArrayList<Integer>(0), results);
    }

    @Test
    public void secondTest() {
        //if I didn't implement Generator I would go through the list
        //and count 
        log("Testing method with a list of consecutive integers");
        ArrayList<Integer> results = TestedClass.testMe(integersList);
        Assert.assertEquals(Generator.getIntList("odd", 5), results);
    }

    @After
    public void hhh(){
        log("Task1 finished");
    }
    

    
}