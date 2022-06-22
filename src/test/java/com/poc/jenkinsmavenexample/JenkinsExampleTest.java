package com.poc.jenkinsmavenexample;

import org.junit.jupiter.api.*;

class JenkinsExampleTest {

    public JenkinsExample je;

    @BeforeEach
    public void setUp() {
        je = new JenkinsExample();
    }

    @DisplayName("Play FizzBuzz with number = 1")
    @Test
    public void testNumber() {
        String fizzBuzz = je.play(1);
        Assertions.assertEquals(fizzBuzz, "1");
    }

    @DisplayName("Play FizzBuzz with number = 3")
    @Test
    public void testFizz() {
        String fizzBuzz = je.play(3);
        Assertions.assertEquals(fizzBuzz, "Fizz");
    }

    @DisplayName("Play FizzBuzz with number = 5")
    @Test
    public void testBuzz() {
        String fizzBuzz = je.play(5);
        Assertions.assertEquals(fizzBuzz, "Buzz");
    }

    @DisplayName("Don't Play FizzBuzz with number = 0")
    @Test
    public void testZero() {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> je.play(0));
    }

    @AfterEach
    public void tearDown() {
        je = null;
    }
}