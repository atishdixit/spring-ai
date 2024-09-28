package com.ext.ai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("spring.ai.openai.chat.options.model")
    private String modal;

    @Autowired
    ChatModel chatModel;

    @Bean
    ChatClient chatClient(){
        return ChatClient.create(chatModel);
    }
}
