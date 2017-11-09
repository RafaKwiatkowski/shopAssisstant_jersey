package rafal.kwiatkowski.shopassistant_jersey.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import rafal.kwiatkowski.shopassistant_jersey.controller.ProductController;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(ProductController.class);
    }
}
