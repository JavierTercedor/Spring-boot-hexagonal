package com.hexagonal.cron.domains;

import java.util.Optional;

/**
 * Created by javiertercedor on 16/9/18.
 */
public class Cron {

    private static final String EMPTY_RESPONSE = "Empty Response";

    private String response;

    public static Cron createCron(String response){
        return new Cron(response);
    }

    private Cron(String response){
        this.setResponse(response);
    }

    private void setResponse(String response){
        this.response = Optional.ofNullable(response).orElse(EMPTY_RESPONSE);
    }

    @Override
    public String toString() {
        return "Cron{" +
                "response='" + response + '\'' +
                '}';
    }
}
