import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlternatingCharactersTest {

    @Test
    public void alternatingCharactersTest1() {
        String test = "AABAAB";
        int result = AlternatingCharacters.alternatingCharacters(test);
        assertEquals(2,result);
    }

    @Test
    public void alternatingCharactersTest2() {
        String test = "AAAA";
        int result = AlternatingCharacters.alternatingCharacters(test);
        assertEquals(3,result);
    }

    @Test
    public void alternatingCharactersTest3() {
        String test = "BBBBB";
        int result = AlternatingCharacters.alternatingCharacters(test);
        assertEquals(4,result);
    }

    @Test
    public void alternatingCharactersTest4() {
        String test = "ABABABAB";
        int result = AlternatingCharacters.alternatingCharacters(test);
        assertEquals(0,result);
    }

    @Test
    public void alternatingCharactersTest5() {
        String test = "BABABA";
        int result = AlternatingCharacters.alternatingCharacters(test);
        assertEquals(0,result);
    }

    @Test
    public void alternatingCharactersTest6() {
        String test = "AAABBB";
        int result = AlternatingCharacters.alternatingCharacters(test);
        assertEquals(4,result);
    }

    @Test
    public void alternatingCharactersTest7() {
        String test = "AAABBBAABB";
        int result = AlternatingCharacters.alternatingCharacters(test);
        assertEquals(6,result);
    }

    @Test
    public void alternatingCharactersTest8() {
        String test = "AABBAABB";
        int result = AlternatingCharacters.alternatingCharacters(test);
        assertEquals(4,result);
    }

    @Test
    public void alternatingCharactersTest9() {
        String test = "ABABABAA";
        int result = AlternatingCharacters.alternatingCharacters(test);
        assertEquals(1,result);
    }

    @Test
    public void alternatingCharactersTest10() {
        String test = "ABBABBAA";
        int result = AlternatingCharacters.alternatingCharacters(test);
        assertEquals(3,result);
    }
}