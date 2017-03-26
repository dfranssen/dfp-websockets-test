package be.ditavision;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication(scanBasePackages = "be.ditavision")
public class DemoChatApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoChatApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {}

}


