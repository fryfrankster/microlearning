package com.example.microlearning.service;

import com.example.microlearning.model.Topic;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.sql.Timestamp;
import java.util.List;

@Service
public class TopicService {

    public List<Topic> getTopics() throws Exception {
        return List.of(new Topic(Long.valueOf("1"), "Willy The Whale",
                "Learn about the whale", new URL("https://www.google.com/?client=safari"),
                Integer.valueOf("0"), Integer.valueOf("0"), Long.valueOf("0"), new Timestamp(0), new Timestamp(0)));
    }
}
