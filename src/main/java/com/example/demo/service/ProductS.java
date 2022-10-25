package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductS {

  @Autowired
  private ProductR pr;

  public List<Product> getAllProducts() {
    List<Product> pl = new ArrayList<>();
    pr.findAll().forEach(p -> pl.add(p));
    return pl;
  }

}
