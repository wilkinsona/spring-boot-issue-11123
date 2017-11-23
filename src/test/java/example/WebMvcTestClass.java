package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.testng.annotations.Test;

@WebMvcTest
@Test(groups = "webmvc", dependsOnGroups = "test1")
public class WebMvcTestClass extends AbstractTestNGSpringContextTests {
    @Autowired private MockMvc mockMvc;

    @Test
    public void testMethod() {
    }
}
