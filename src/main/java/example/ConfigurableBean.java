package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class ConfigurableBean {
    @Autowired public ServiceBean serviceBean;
}
