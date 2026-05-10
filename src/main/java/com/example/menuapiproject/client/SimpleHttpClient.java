package com.example.menuapiproject.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

@Service
public class SimpleHttpClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public boolean call(String url) {

        try {
            restTemplate.getForEntity(url, Void.class);
            return true; // 200
        } catch (HttpStatusCodeException ex) {

            if (ex.getStatusCode().is5xxServerError()) {
                return false; // 500
            }

            return false;
        }
    }
    public boolean post(String url, Object requestBody) {
        try {
            restTemplate.postForEntity(url, requestBody, Void.class);
            return true;
        } catch (HttpStatusCodeException ex) {
            return false;
        }
    }
}
