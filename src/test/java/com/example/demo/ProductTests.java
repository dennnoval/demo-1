package com.example.demo;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductS;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class ProductTests {

  @Autowired
  private MockMvc mmvc;

  @Test
  void getAllProducts_Test() throws Exception {
    mmvc.perform(get("/products").accept("application/json"))
        .andExpect(status().isOk())
        .andExpect(content().contentTypeCompatibleWith("application/json"))
        .andExpect(jsonPath("$.products[*].price").exists())
        .andDo(print());

    // Used by WebTestClient
    /*wtc.get().uri("/api/v1/products")
        .exchange()
        .expectStatus().isOk()
        .expectHeader().contentType("application/json")
        .expectBody().jsonPath("$.price").isNotEmpty();*/

    // Used by TestRestTemplate
    /*Assertions.assertThat(trt.getForEntity("http://localhost:9090/api/v1/products", Product.class))
        .isNotNull();*/
  }

}
