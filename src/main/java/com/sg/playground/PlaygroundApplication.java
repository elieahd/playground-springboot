package com.sg.playground;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
  info = @Info(
    title = "Playground API",
    version = "1.0",
    description = "API documentation for hte spring boot playground application"
  )
)
public class PlaygroundApplication {

  public static void main(String[] args) {
    SpringApplication.run(PlaygroundApplication.class, args);
  }
}
