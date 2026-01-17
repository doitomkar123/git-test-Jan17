package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testRootEndpoint() {
        String response = restTemplate.getForObject("/", String.class);
        assertThat(response).isEqualTo("Hello World!");
    }

    @Test
    void testHelloEndpoint() {
        String response = restTemplate.getForObject("/hello", String.class);
        assertThat(response).isEqualTo("Hello from springboot");
    }
}
