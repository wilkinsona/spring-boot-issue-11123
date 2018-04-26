package example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration(classes=Application.class)
@RunWith(SpringRunner.class)
@ActiveProfiles("service")
public class Test2 {

    @Test
    public void testMethod() {
        ConfigurableBean configurableBean = new ConfigurableBean();
        Assert.assertNotNull( configurableBean.serviceBean );
    }

}
