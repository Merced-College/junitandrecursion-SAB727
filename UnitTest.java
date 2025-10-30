

public class UnitTest {

    // first JUnit test
    @org.junit.Test
    public void testCountHi1() {
        int result = TestClass.countHi("xxhixxxhixxxx");
        org.junit.Assert.assertEquals(2, result);
    }
    
    // second JUnit test
    @org.junit.Test
    public void testCountHi2() {
        int result = TestClass.countHi("hihih");
        org.junit.Assert.assertEquals(2, result);
    }

    // third JUnit test
    @org.junit.Test
    public void testCountHi3() {
        int result = TestClass.countHi("hello");
        org.junit.Assert.assertEquals(0, result);
    }

    // fourth JUnit test
    @org.junit.Test
    public void testCountHi4() {
        int result = TestClass.countHi("abc");
        org.junit.Assert.assertEquals(0, result);
    }

    // fifth JUnit test
    @org.junit.Test
    public void testCountHi5() {
        int result = TestClass.countHi(null);
        org.junit.Assert.assertEquals(0, result);
    }

    // sixth JUnit test
    @org.junit.Test
    public void testCountHi6() {
        int result = TestClass.countHi("");
        org.junit.Assert.assertEquals(0, result);
    }

    // seventh JUnit test
    @org.junit.Test
    public void testCountHi7() {
        int result = TestClass.countHi("hihihi");
        org.junit.Assert.assertEquals(3, result);
    }

    // eighth JUnit test
    @org.junit.Test
    public void testCountHi8() {
        int result = TestClass.countHi("xhixhix");
        org.junit.Assert.assertEquals(2, result);
    }

    // ninth JUnit test
    @org.junit.Test
    public void testCountHi9() {
        int result = TestClass.countHi("hihohi");
        org.junit.Assert.assertEquals(2, result);
    }

    // tenth JUnit test
    @org.junit.Test
    public void testCountHi10() {
        int result = TestClass.countHi("hihihello");
        org.junit.Assert.assertEquals(2, result);
    }
}
