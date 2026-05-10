package com.example.menuapiproject.api.logic;

import com.example.dto.*;
import com.example.menuapiproject.client.SimpleHttpClient;
import com.example.menuapiproject.utils.ApiPaths;
import com.example.menuapiproject.utils.MenuException;
import org.springframework.stereotype.Service;

@Service
public class LogicApiService {

    private final SimpleHttpClient simpleHttpClient;

    public LogicApiService(SimpleHttpClient simpleHttpClient) {
        this.simpleHttpClient = simpleHttpClient;
    }

    public void checkPalindrome(CheckPalindromeRequest request) {
        boolean success = simpleHttpClient.post(
                ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.LOGIC_PALINDROME,
                request
        );
        if (!success) {
            throw new MenuException("Ошибка при проверке палиндрома");
        }
    }

    public void calculateFactorial(CalculateFactorialRequest request) {
        boolean success = simpleHttpClient.post(
                ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.LOGIC_FACTORIAL,
                request
        );
        if (!success) {
            throw new MenuException("Ошибка при вычислении факториала");
        }
    }

    public void calculateFibonacci(CalculateFibonacciRequest request) {
        boolean success = simpleHttpClient.post(
                ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.LOGIC_FIBONACCI,
                request
        );
        if (!success) {
            throw new MenuException("Ошибка при вычислении числа Фибоначчи");
        }
    }

    public void isPrimeNumber(IsPrimeNumberRequest request) {
        boolean success = simpleHttpClient.post(
                ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.LOGIC_PRIME,
                request
        );
        if (!success) {
            throw new MenuException("Ошибка при проверке числа на простоту");
        }
    }

    public void sortArray(SortArrayRequest request) {
        boolean success = simpleHttpClient.post(
                ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.LOGIC_SORT,
                request
        );
        if (!success) {
            throw new MenuException("Ошибка при сортировке массива");
        }
    }
}