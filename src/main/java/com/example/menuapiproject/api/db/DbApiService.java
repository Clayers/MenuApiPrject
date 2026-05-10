package com.example.menuapiproject.api.db;

import com.example.menuapiproject.client.SimpleHttpClient;
import com.example.menuapiproject.utils.ApiPaths;
import com.example.menuapiproject.utils.MenuException;
import org.springframework.stereotype.Service;

@Service
public class DbApiService {

    private final SimpleHttpClient simpleHttpClient;

    public DbApiService(SimpleHttpClient simpleHttpClient) {
        this.simpleHttpClient = simpleHttpClient;
    }

    public void generateAllNsi() {
        String url = ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.DB_GENERATE_NSI;
        boolean success = simpleHttpClient.post(url, null);
        if (!success) {
            throw new MenuException("Ошибка при генерации NSI справочников");
        }
    }

    public void generateRandomUsers() {
        String url = ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.DB_GENERATE_USERS;
        boolean success = simpleHttpClient.post(url, null);
        if (!success) {
            throw new MenuException("Ошибка при генерации пользователей");
        }
    }

    public void generateWorkForAllUsers() {
        String url = ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.DB_GENERATE_WORK;
        boolean success = simpleHttpClient.post(url, null);
        if (!success) {
            throw new MenuException("Ошибка при генерации мест работы");
        }
    }

    public void generateRandomProducts() {
        String url = ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.DB_GENERATE_PRODUCTS;
        boolean success = simpleHttpClient.post(url, null);
        if (!success) {
            throw new MenuException("Ошибка при генерации товаров");
        }
    }

    public void generateRandomPurchases() {
        String url = ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.DB_GENERATE_PURCHASES;
        boolean success = simpleHttpClient.post(url, null);
        if (!success) {
            throw new MenuException("Ошибка при генерации покупок");
        }
    }

    public void generateMissingAccounts() {
        String url = ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.DB_GENERATE_ACCOUNTS;
        boolean success = simpleHttpClient.post(url, null);
        if (!success) {
            throw new MenuException("Ошибка при создании счетов");
        }
    }

    public void paySalaryToAllUsers() {
        String url = ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.DB_SALARY_PAY;
        boolean success = simpleHttpClient.post(url, null);
        if (!success) {
            throw new MenuException("Ошибка при начислении зарплаты");
        }
    }

    public void generateAllData() {
        String url = ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.DB_GENERATE_ALL;
        boolean success = simpleHttpClient.post(url, null);
        if (!success) {
            throw new MenuException("Ошибка при генерации всех данных");
        }
    }

    public void clearAllTables() {
        String url = ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.DB_CLEAR;
        boolean success = simpleHttpClient.call(url); // DELETE запрос, используем call или добавить delete в SimpleHttpClient
        if (!success) {
            throw new MenuException("Ошибка при очистке таблиц");
        }
    }

    public void showStatistics() {
        String url = ApiPaths.BUSINESS_SERVICE_BASE + ApiPaths.DB_STATS;
        boolean success = simpleHttpClient.call(url); // GET запрос
        if (!success) {
            throw new MenuException("Ошибка при получении статистики");
        }
    }
}
