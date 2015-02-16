package com.DavidNeely;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProjectEulerOneTest {

  @Test
  public void testComputeSumOfMulitples() throws Exception {
    assertEquals("tests for input of 10", 23, ProjectEulerOne.computeSumOfMulitples(10));
  }

  @Before
  public void setUp() throws Exception {

  }

}