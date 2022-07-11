package org.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
    @BeforeClass
	public static void beforeclass() {
    	WebDriverManager.chromedriver().setup();
    	
    	
		System.out.println("Before Class");
	}
    @AfterClass
    public  static void afterclass() {
        System.out.println("After Class");
      
        
	}@Before
    public void before() {
	    System.out.println("Before");

	}
	@After
	public void after() {
        System.out.println("After");
        
	}
	@Test
	public void test1() {
         System.out.println("Test1");
	} 
	@Test
	public void test2() {
         System.out.println("Test2");
	}
	@Test
	public void test3() {
		System.out.println("Test3");
          
	}
	
	
	
	
    

}
