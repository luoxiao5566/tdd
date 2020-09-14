import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {
    @Test
    void should_return_true_when_proportion_vowels_greater_than_thirty_percent(){
        Mommifier mommifier = new Mommifier();

        String str1 = "aaaeeiiffdooorqwelluu";

        Boolean bln = mommifier.Proportion(str1);

        assertEquals(true,bln);
    }




}
