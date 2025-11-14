package com.example.java_jenkins_docker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	@GetMapping("/")
    public String home() {
        return "✅ Hello from AWS EC2 Java App12333!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running fine!";
    }
}

