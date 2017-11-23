package example;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest
@Test(groups = "test2", dependsOnGroups = "webmvc") //commenting this line fixes tests
public class SpringBootTest2 extends AbstractTestNGSpringContextTests {

    @Test
    public void testMethod() {
        ConfigurableBean configurableBean = new ConfigurableBean();
        Assert.assertNotNull( configurableBean.serviceBean );
    }
}
