package com.ext.ai.service.impl;

import com.ext.ai.client.CustomAIClient;
import com.ext.ai.queries.Queries;
import com.ext.ai.queries.QueryUtil;
import com.ext.ai.service.infc.GenerativeServiceInfc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerativeService implements GenerativeServiceInfc {

    @Autowired
    private CustomAIClient aiClient;

    public String generateResult(String input){
        return aiClient.call(QueryUtil.prepareQuery(Queries.JOKES_BASED_ON_GIVEN_TOPIC, input));
    }
}
