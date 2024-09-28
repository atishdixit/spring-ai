package com.ext.ai.client;

import com.ext.ai.queries.QueryUtil;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class CustomAIClient {

    @Autowired
    private ChatClient chatClient;

    public String call(String query) {
        return this.chatClient.prompt().user(query).call().content();
    }
}
