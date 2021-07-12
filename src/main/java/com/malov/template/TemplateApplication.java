package com.malov.template;

import com.malov.template.stream.StreamTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TemplateApplication {
    private StreamTemplate streamTemplate;

    public TemplateApplication(StreamTemplate streamTemplate) {
        this.streamTemplate = streamTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }

    @PostConstruct
    void TemplateApplication() {
        streamTemplate.flatMapStream();
        streamTemplate.getMinForStream();


    }

}
