package tests.api;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.*;

public class AnnotationExecutionOrder {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }
    @BeforeMethod
    public void setUpEachMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After Method");
    }
    @BeforeSuite
    public void setUpSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void tearDownSuited(){
        System.out.println("After Suite");
    }
    @BeforeTest
    public void setUpTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void tearDownTest(){
        System.out.println("After Test");
    }
    @Test
    public void methdod1(){
        System.out.println("Test 1");
    }
    @Test
    public void methdod2(){
        System.out.println("Test 2 ");
    }
}


