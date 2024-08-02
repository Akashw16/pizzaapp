package com.pizzaquickserve.controllers;

import com.pizzaquickserve.entities.Customer;
import com.pizzaquickserve.entities.Order;
import com.pizzaquickserve.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/sales")
    public ResponseEntity<List<Order>> getSalesReport() {
        return ResponseEntity.ok(reportService.getSalesReport());
    }

    @GetMapping("/active-users")
    public ResponseEntity<List<Customer>> getActiveUsersReport() {
        return ResponseEntity.ok(reportService.getActiveUsersReport());
    }
}
