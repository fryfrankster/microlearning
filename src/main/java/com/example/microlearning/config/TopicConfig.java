package com.example.microlearning.config;

import com.example.microlearning.model.Topic;
import com.example.microlearning.repository.TopicRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;
import java.sql.Timestamp;
import java.util.List;

@Configuration
public class TopicConfig {

    @Bean
    CommandLineRunner commandLineRunner(TopicRepository topicRepository) {
        return args -> {
            Topic willy = new Topic(
                    "Why freeing Willy was the wrong thing to do",
                    "Learn more the willy",
                    new URL("https://www.newscientist.com/article/dn17039-why-freeing-willy-was-the-wrong-thing-to-do/#ixzz6rcmuXWcF"),
                    Integer.valueOf("0"),
                    Integer.valueOf("0"),
                    Long.valueOf("0"),
                    new Timestamp(System.currentTimeMillis()),
                    new Timestamp(System.currentTimeMillis())
            );
            Topic taika = new Topic(
                    "Taika Waititi",
                    "Taika David Cohen ONZM, known professionally as Taika Waititi, is a New Zealand film and television director, producer, screenwriter, actor, and comedian.",
                    new URL("https://en.wikipedia.org/wiki/Taika_Waititi"),
                    Integer.valueOf("0"),
                    Integer.valueOf("0"),
                    Long.valueOf("1"),
                    new Timestamp(System.currentTimeMillis()),
                    new Timestamp(System.currentTimeMillis())
            );

            topicRepository.saveAll(List.of(willy, taika));
        };
    }
}
