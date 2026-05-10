package com.example.menuapiproject.api.db;

import com.example.api.DatabaseOperationsApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbApiController implements DatabaseOperationsApi {

    private final DbApiService dbApiService;

    public DbApiController(DbApiService dbApiService) {
        this.dbApiService = dbApiService;
    }

    @Override
    public ResponseEntity<Void> generateAllNsi() {
        dbApiService.generateAllNsi();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> generateRandomUsers() {
        dbApiService.generateRandomUsers();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> generateWorkForAllUsers() {
        dbApiService.generateWorkForAllUsers();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> generateRandomProducts() {
        dbApiService.generateRandomProducts();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> generateRandomPurchases() {
        dbApiService.generateRandomPurchases();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> generateMissingAccounts() {
        dbApiService.generateMissingAccounts();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> paySalaryToAllUsers() {
        dbApiService.paySalaryToAllUsers();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> generateAllData() {
        dbApiService.generateAllData();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> clearAllTables() {
        dbApiService.clearAllTables();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> showStatistics() {
        dbApiService.showStatistics();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}