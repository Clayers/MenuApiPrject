package com.example.menuapiproject.api.hello;

import com.example.api.HelloApi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController implements HelloApi {

    private final HelloApiService helloApiService;

    public HelloApiController(HelloApiService helloApiService) {
        this.helloApiService =  helloApiService;
    }



    @Override
    public ResponseEntity<Void> getHello() {

        helloApiService.getInfoHello();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
