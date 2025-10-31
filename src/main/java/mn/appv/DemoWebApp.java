package mn.appv;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import jakarta.validation.constraints.Size;

@Controller("/")
public class DemoWebApp {

    @Get("/greeting")
    public String greeting(@Size(min = 5, max = 10, message = "Name should be minimum 5 to 10") @QueryValue String name) {
        if (name == null || name.isEmpty()) {
            return "Hello Dear";
        } else {
            return "Hello " + name;
        }
    }

}
