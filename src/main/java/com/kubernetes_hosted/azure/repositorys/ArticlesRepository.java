package com.kubernetes_hosted.azure.repositorys;

import com.github.javafaker.Faker;
import com.kubernetes_hosted.azure.entitys.Articles;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

public class ArticlesRepository {
    private final Faker DATAMOCK = new Faker();
    private static final int SIZE_ARTICLES_DB = 95;
    private final List<Articles> DATABASE = new ArrayList<>();
    @PostConstruct
    public void config() {
        for (int i = 0; i < SIZE_ARTICLES_DB; i++) {
            DATABASE.add(Articles.builder()
                    .from(DATAMOCK.name().fullName())
                    .content(DATAMOCK.lorem().characters(870, 8_000))
                    .title(DATAMOCK.lorem().characters(8, 19))
                    .build());
        }    }
public List<Articles> findAll() {
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    return DATABASE;
}

}
