package tasks.acceptancetests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


import static utils.utils.*;



public class Task2Unit {

    @Before
    public void ggg(){
        log("ggg allll");
    }

    @Test
    public void fff() {
        log("hhhh allll");
    }

    @After
    public void hhh(){
        log("hkkkkkkkkkkkhhallllll");
    }

    
}