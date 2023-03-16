package com.example.webclientsession;

import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Service
public class RMService {

    private final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    List<Results> getCharacters() {
        ResponseEntity<List<Results>> responseEntity = webClient
                .get()
                .uri("/character")
                .retrieve()
                .toEntityList(Results.class)
                .block()
                ;
        return Objects.requireNonNull(responseEntity).getBody();
    }
}






