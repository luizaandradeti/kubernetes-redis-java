package com.kubernetes_hosted.azure.controllers;
import com.kubernetes_hosted.azure.entitys.Articles;
import com.kubernetes_hosted.azure.repositorys.ArticlesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
public class ArticlesControllers {
    private final ArticlesRepository repository;

    @GetMapping
    public List<Articles> findAll() {
        return repository.findAll();
    }
}
