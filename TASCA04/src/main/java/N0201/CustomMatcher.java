package N0201;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class CustomMatcher extends FeatureMatcher<String, Integer> {

    public CustomMatcher(Matcher<? super Integer> subMatcher) {
        super(subMatcher,
                "String length expected",
                "ERROR.String length NOT expected");
    }

    @Override
    protected Integer featureValueOf(String s) {
        return s.length();
    }

}
