package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Spring Boot application deployed inside of a docker container orchestrated with Kubernetes in Red Hat OpenShift Cloud(S2I - Source to Image based builders). ");
    }
}