package example;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
@Test(groups = "test1")
public class SpringBootTest1 extends AbstractTestNGSpringContextTests {

    @Test
    public void testMethod() {

    }
}
