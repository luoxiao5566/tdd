import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {
    @Test
    void should_return_true_when_proportion_vowels_greater_than_thirty_percent(){
        Mommifier mommifier = new Mommifier();

        String str = "aaaeeiiffdooorqwelluu";

        Boolean bln = mommifier.Proportion_judgment(str);

        assertEquals(true,bln);
    }
    @Test
    void should_return_true_when_proportion_vowels_less_than_thirty_percent(){
        Mommifier mommifier = new Mommifier();

        String str = "aaallytmnncxzjghasdhf";

        Boolean bln = mommifier.Proportion_judgment(str);

        assertEquals(false,bln);
    }

    @Test
    void should_return_String_itself_when_proportion_vowels_less_than_thirty_percent(){
        Mommifier mommifier = new Mommifier();

        String str = "aaallytmnncxzjghasdhf";

        String result = mommifier.string_mommifier(str);

        assertEquals("aaallytmnncxzjghasdhf",result);
    }

}
