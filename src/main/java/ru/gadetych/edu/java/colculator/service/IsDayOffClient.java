package ru.gadetych.edu.java.colculator.service;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
@AllArgsConstructor
public class IsDayOffClient {
    private final WebClient webClient;

    public String getData(LocalDate date1, LocalDate date2){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String a = dateTimeFormatter.format(date1);
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/getdata")
                        .queryParam("date1", dateTimeFormatter.format(date1))
                        .queryParam("date2", dateTimeFormatter.format(date2))
                        .queryParam("delimeter", "/")
                        .build())
                .accept(MediaType.TEXT_PLAIN)
                .retrieve()
                .bodyToMono(String.class).block();
    }
}
