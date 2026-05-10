package com.example.menuapiproject.api.hello;


import com.example.menuapiproject.client.SimpleHttpClient;
import com.example.menuapiproject.utils.ApiPaths;
import com.example.menuapiproject.utils.MenuException;
import org.springframework.stereotype.Service;

@Service
public class HelloApiService {

    private final SimpleHttpClient simpleHttpClient;

    public HelloApiService(SimpleHttpClient simpleHttpClient) {
        this.simpleHttpClient = simpleHttpClient;
    }

    public void getInfoHello() {

        boolean success = simpleHttpClient.call(
                ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.HELLO
        );

        if (!success) {
            throw new MenuException("Something went wrong");
        }
    }
}
