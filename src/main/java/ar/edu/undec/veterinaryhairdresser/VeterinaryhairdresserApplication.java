package ar.edu.undec.veterinaryhairdresser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class VeterinaryhairdresserApplication {

    public static void main(String[] args) {
        SpringApplication.run(VeterinaryhairdresserApplication.class, args);
    }

}
