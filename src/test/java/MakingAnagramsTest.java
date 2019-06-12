import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakingAnagramsTest {

    @Test
    public void makeAnagramTest1() {
        String a = "cde";
        String b = "dcf";
        int result = MakingAnagrams.makeAnagram(a,b);
        assertEquals(2,result);
    }

    @Test
    public void makeAnagramTest2() {
        String a = "cde";
        String b = "abc";
        int result = MakingAnagrams.makeAnagram(a,b);
        assertEquals(4,result);
    }

    @Test
    public void makeAnagramTest3() {
        String a = "aparcamiento";
        String b = "metacarpiano";
        int result = MakingAnagrams.makeAnagram(a,b);
        assertEquals(0,result);
    }

    @Test
    public void makeAnagramTest4() {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        int result = MakingAnagrams.makeAnagram(a,b);
        assertEquals(30,result);
    }

    @Test
    public void makeAnagramTest5() {
        String a = "showman";
        String b = "woman";
        int result = MakingAnagrams.makeAnagram(a,b);
        assertEquals(2,result);
    }
}