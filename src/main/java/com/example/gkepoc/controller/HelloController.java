package com.example.gkepoc.controller;

import com.example.gkepoc.config.GreetingConfig;
import com.example.gkepoc.dto.GreetingDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

import static java.lang.String.format;

@AllArgsConstructor
@RestController
public class HelloController {
    private final GreetingConfig greetingConfig;

    @GetMapping("/greeting")
    public GreetingDto greeting() {
        GreetingDto greetingDto = new GreetingDto();
        greetingDto.setMsg(format("Hello %s", greetingConfig.getName()));
        greetingDto.setTime(Instant.now());
        return greetingDto;
    }
}
