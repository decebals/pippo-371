import org.junit.Rule;
import org.junit.Test;
import ro.pippo.core.Application;
import ro.pippo.core.HttpConstants.StatusCode;
import ro.pippo.test.PippoRule;
import ro.pippo.test.PippoTest;

public class JettyTest extends PippoTest {

    private final static class MyApplication extends Application {

        @Override
        protected void onInit() {
            GET("/", routeContext -> routeContext.status(200));
        }

    }

    @Rule
    public PippoRule pippoRule = new PippoRule(new MyApplication());

    @Test
    public void test1() {
        when().
            get("/").
            then().
            statusCode(StatusCode.OK);
    }

    @Test
    public void test2() {
        when().
            get("/").
            then().
            statusCode(StatusCode.OK);
    }

}
