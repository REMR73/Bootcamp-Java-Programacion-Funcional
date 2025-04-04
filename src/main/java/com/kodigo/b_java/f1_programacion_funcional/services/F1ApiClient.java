package com.kodigo.b_java.f1_programacion_funcional.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kodigo.b_java.f1_programacion_funcional.models.F1Response;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class F1ApiClient {
    private static final String BASE_URL = "https://f1api.dev/api";
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public F1ApiClient() {
        this.httpClient = HttpClient.newBuilder().build();
        this.objectMapper = new ObjectMapper();
    }
    /**
     * Obtiene los resultados de la primera práctica libre (FP1) para una temporada y ronda específicas
     * usando programación asíncrona con CompletableFuture
     */
    public CompletableFuture<F1Response> getFP1ResultsAsync(int season, int round) {
        String url = String.format("%s/%d/%d/fp1", BASE_URL, season, round);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        return httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(this::parseResponse)
                .exceptionally(ex -> {
                    System.err.println("Error al consumir la API: " + ex.getMessage());
                    return null;
                });
    }

    /**
     * Obtiene los resultados de la primera práctica libre (FP1) para una temporada y ronda específicas
     * usando programación sincrónica
     */
    public F1Response getFP1Results(int season, int round) throws Exception {
        String url = String.format("%s/%d/%d/fp1", BASE_URL, season, round);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        return parseResponse(response.body());
    }

    private F1Response parseResponse(String jsonResponse) {
        try {
            return objectMapper.readValue(jsonResponse, F1Response.class);
        } catch (Exception e) {
            throw new RuntimeException("Error al parsear la respuesta JSON", e);
        }
    }
}
