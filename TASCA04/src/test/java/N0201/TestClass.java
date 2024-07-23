package N0201;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;

public class TestClass {
    @Test
    public void testLengthString6() {
        CustomMatcher matcher6 = new CustomMatcher(is(6));
        MatcherAssert.assertThat("Mordor", matcher6);
    }

    @Test
    public void testLengthString8() {
        CustomMatcher matcher8 = new CustomMatcher(is(8));
        MatcherAssert.assertThat("Mordor", matcher8);
    }
}
