package example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration(classes=Application.class)
@RunWith(SpringRunner.class)
@ActiveProfiles("service")
public class Test1 {

    @Test
    public void testMethod() {

    }

}
