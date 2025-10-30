

public class UnitTest {

    // first JUnit test
    @org.junit.Test
    public void test1CountHi() {
        int result = TestClass.countHi("xxhixxxhixxxx");
        org.junit.Assert.assertEquals(2, result);
    }
    
    // second JUnit test
    @org.junit.Test
    public void test2CountHi() {
        int result = TestClass.countHi("hihih");
        org.junit.Assert.assertEquals(2, result);
    }

    // third JUnit test
    @org.junit.Test
    public void test3CountHi() {
        int result = TestClass.countHi("hello");
        org.junit.Assert.assertEquals(0, result);
    }

    // fourth JUnit test
    @org.junit.Test
    public void test4CountHi() {
        int result = TestClass.countHi("abc");
        org.junit.Assert.assertEquals(0, result);
    }

    // fifth JUnit test
    @org.junit.Test
    public void test5CountHi() {
        int result = TestClass.countHi(null);
        org.junit.Assert.assertEquals(0, result);
    }

    // sixth JUnit test
    @org.junit.Test
    public void test6CountHi() {
        int result = TestClass.countHi("");
        org.junit.Assert.assertEquals(0, result);
    }

    // seventh JUnit test
    @org.junit.Test
    public void test7CountHi() {
        int result = TestClass.countHi("hihihi");
        org.junit.Assert.assertEquals(3, result);
    }

    // eighth JUnit test
    @org.junit.Test
    public void test8CountHi() {
        int result = TestClass.countHi("xhixhix");
        org.junit.Assert.assertEquals(2, result);
    }

    // ninth JUnit test
    @org.junit.Test
    public void test9CountHi() {
        int result = TestClass.countHi("hihohi");
        org.junit.Assert.assertEquals(2, result);
    }

    // tenth JUnit test
    @org.junit.Test
    public void test10CountHi() {
        int result = TestClass.countHi("hihihello");
        org.junit.Assert.assertEquals(2, result);
    }

    // countHi2 tests
    @org.junit.Test
    public void test1CountHi2() {
        int result = TestClass.countHi2("xxhixxxhixxxx");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void test2CountHi2() {
        int result = TestClass.countHi2("xhixhix");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void test3CountHi2() {
        int result = TestClass.countHi2("hihihi");
        org.junit.Assert.assertEquals(3, result);
    }

    @org.junit.Test
    public void test4CountHi2() {
        int result = TestClass.countHi2("hixhihixhi");
        org.junit.Assert.assertEquals(2, result);
    }

    @org.junit.Test
    public void test5CountHi2() {
        int result = TestClass.countHi2("xhixhihixhi");
        org.junit.Assert.assertEquals(1, result);   
    }

    @org.junit.Test
    public void test6CountHi2() {
        int result = TestClass.countHi2("hello");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void test7CountHi2() {
        int result = TestClass.countHi2("xhi");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void test8CountHi2() {
        int result = TestClass.countHi2("hi");
        org.junit.Assert.assertEquals(1, result);
    }

    @org.junit.Test
    public void test9CountHi2() {
        int result = TestClass.countHi2("xhixhi");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void test10CountHi2() {
        int result = TestClass.countHi2("hixhi");
        org.junit.Assert.assertEquals(1, result);
    }

    // count8 tests
    @org.junit.Test
    public void test1Count8() {
        int result = TestClass.count8(8818);
        org.junit.Assert.assertEquals(4, result);
    }

    @org.junit.Test
    public void test2Count8() {
        int result = TestClass.count8(818);
        org.junit.Assert.assertEquals(2, result);
    }

    @org.junit.Test
    public void test3Count8() {
        int result = TestClass.count8(8);
        org.junit.Assert.assertEquals(1, result);
    }

    @org.junit.Test
    public void test4Count8() {
        int result = TestClass.count8(123);
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void test5Count8() {
        int result = TestClass.count8(81238);
        org.junit.Assert.assertEquals(2, result);
    }

    @org.junit.Test
    public void test6Count8() {
        int result = TestClass.count8(88888);
        org.junit.Assert.assertEquals(9, result);
    }

    @org.junit.Test
    public void test7Count8() {
        int result = TestClass.count8(0);
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void test8Count8() {
        int result = TestClass.count8(181818);
        org.junit.Assert.assertEquals(3, result);
    }

    @org.junit.Test
    public void test9Count8() {
        int result = TestClass.count8(278);
        org.junit.Assert.assertEquals(1, result);
    }

    @org.junit.Test
    public void test10Count8() {
        int result = TestClass.count8(12345);
        org.junit.Assert.assertEquals(0, result);
    }

    // strCount tests
    @org.junit.Test
    public void test1StrCount() {
        int result = TestClass.strCount("catcowcat", "cat");
        org.junit.Assert.assertEquals(2, result);
    }

    @org.junit.Test
    public void test2StrCount() {
        int result = TestClass.strCount("catcowcat", "cow");
        org.junit.Assert.assertEquals(1, result);
    }

    @org.junit.Test
    public void test3StrCount() {
        int result = TestClass.strCount("catcowcat", "dog");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void test4StrCount() {
        int result = TestClass.strCount("aaaa", "aa");
        org.junit.Assert.assertEquals(2, result);
    }

    @org.junit.Test
    public void test5StrCount() {
        int result = TestClass.strCount("aaaa", "a");
        org.junit.Assert.assertEquals(4, result);
    }

    @org.junit.Test
    public void test6StrCount() {
        int result = TestClass.strCount("", "a");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void test7StrCount() {
        int result = TestClass.strCount("abc", "");
        org.junit.Assert.assertEquals(0, result);
    }

    @org.junit.Test
    public void test8StrCount() {
        int result = TestClass.strCount("ababab", "ab");
        org.junit.Assert.assertEquals(3, result);
    }

    @org.junit.Test
    public void test9StrCount() {
        int result = TestClass.strCount("ababab", "aba");
        org.junit.Assert.assertEquals(1, result);
    }

    @org.junit.Test
    public void test10StrCount() {
        int result = TestClass.strCount("aaaaa", "aa");
        org.junit.Assert.assertEquals(2, result);
    }

    
}
