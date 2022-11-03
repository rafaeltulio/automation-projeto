package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.ClassRule;
import org.junit.runner.RunWith;
import util.TestRule;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        tags = "@login",
        glue = {""},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        strict = true
)
public class RunTest {

    @ClassRule
    public static TestRule testRule = new TestRule();

}
