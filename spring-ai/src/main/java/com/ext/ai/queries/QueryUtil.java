package com.ext.ai.queries;

import static com.ext.ai.queries.Queries.JOKES_BASED_ON_GIVEN_TOPIC;

public final class QueryUtil {

    private QueryUtil(){}

    public static String prepareQuery(String query, String topic){
        return  String.format(query, topic);
    }
}
