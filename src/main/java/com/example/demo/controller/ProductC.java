package com.example.demo.controller;

import com.example.demo.service.ProductS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductC {

  @Autowired
  private ProductS ps;

  @GetMapping("")
  public ResponseEntity<Object> index() {
    Map<String, Object> res = new HashMap<>();
    res.put("products", ps.getAllProducts());
    return ResponseEntity.ok(res);
  }

}
