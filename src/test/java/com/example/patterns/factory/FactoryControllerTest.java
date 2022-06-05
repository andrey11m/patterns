package com.example.patterns.factory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class FactoryControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void createUser() {
        webTestClient.get()
                .uri("/factory/simple")
                .exchange()
                .expectStatus().is2xxSuccessful().expectBody(String.class).isEqualTo("Simple user in the house");
        webTestClient.get()
                .uri("/factory/admin")
                .exchange()
                .expectStatus().is2xxSuccessful().expectBody(String.class).isEqualTo("Admin user in the house");
        webTestClient.get()
                .uri("/factory/some-user")
                .exchange()
                .expectStatus().is4xxClientError().expectBody(String.class).isEqualTo("Not supported user type");

    }
}