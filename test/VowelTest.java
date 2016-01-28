import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelTest {

    @org.junit.Test
    public void shouldReplaceVowelAPresentInStringWithStringMommy() throws Exception {
        Vowel vowel = new Vowel();
        assertEquals("mommy",vowel.replaceVowelWithMommyString("a"));
    }

    @Test
    public void shouldReplaceVowelEPresentInStringWithStringMommy() throws Exception {
        Vowel vowel = new Vowel();
        assertEquals("mommy",vowel.replaceVowelWithMommyString("e"));
    }

    @Test
    public void shouldReplaceVowelIPresentInStringWithStringMommy() throws Exception {
        Vowel vowel = new Vowel();
        assertEquals("mommy",vowel.replaceVowelWithMommyString("i"));
    }

    @Test
    public void shouldReplaceVowelOPresentInStringWithStringMommy() throws Exception {
        Vowel vowel = new Vowel();
        assertEquals("mommy",vowel.replaceVowelWithMommyString("o"));
    }

    @Test
    public void shouldReplaceVowelUPresentInStringWithStringMommy() throws Exception {
        Vowel vowel = new Vowel();
        assertEquals("mommy",vowel.replaceVowelWithMommyString("u"));
    }

    @Test
    public void shouldReplaceVowelAPresentInStringHAHAWithStringMommy() throws Exception {
        Vowel vowel = new Vowel();
        assertEquals("hmommyhmommy",vowel.replaceVowelWithMommyString("haha"));
    }

    @Test
    public void shouldReplaceVowelAPresentInStringHISWithStringMommy() throws Exception {
        Vowel vowel = new Vowel();
        assertEquals("hmommys",vowel.replaceVowelWithMommyString("his"));
    }

    @Test
    public void shouldReplaceVowelAPresentInStringHARDWithStringMommy() throws Exception {
        Vowel vowel = new Vowel();
        assertEquals("hard",vowel.replaceVowelWithMommyString("hard"));
    }

    @Test
    public void shouldReplaceVowelAPresentInStringHEARWithStringMommy() throws Exception {
        Vowel vowel = new Vowel();
        assertEquals("hmommyr",vowel.replaceVowelWithMommyString("hear"));
    }

}
