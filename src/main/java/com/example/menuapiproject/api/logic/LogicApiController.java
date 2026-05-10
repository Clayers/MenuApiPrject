package com.example.menuapiproject.api.logic;

import com.example.api.LogicTasksApi;
import com.example.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogicApiController implements LogicTasksApi {

    private final LogicApiService logicApiService;

    public LogicApiController(LogicApiService logicApiService) {
        this.logicApiService = logicApiService;
    }

    @Override
    public ResponseEntity<Void> calculateFactorial(CalculateFactorialRequest calculateFactorialRequest) {
        logicApiService.calculateFactorial(calculateFactorialRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> calculateFibonacci(CalculateFibonacciRequest calculateFibonacciRequest) {
        logicApiService.calculateFibonacci(calculateFibonacciRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> checkPalindrome(CheckPalindromeRequest checkPalindromeRequest) {
        logicApiService.checkPalindrome(checkPalindromeRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> isPrimeNumber(IsPrimeNumberRequest isPrimeNumberRequest) {
        logicApiService.isPrimeNumber(isPrimeNumberRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> sortArray(SortArrayRequest sortArrayRequest) {
        logicApiService.sortArray(sortArrayRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}