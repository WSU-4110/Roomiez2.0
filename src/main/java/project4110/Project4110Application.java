package project4110;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@Controller
public class Project4110Application {

    public static void main(String[] args) {
        SpringApplication.run(Project4110Application.class, args);
    }

    @GetMapping("/home")
    public String homePage(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "HomePage";
    }

}


