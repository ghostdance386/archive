package com.polishagency.archive;

import com.polishagency.archive.transferobjects.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class ArticlesRestController {

    private ArticlesRepository articlesRepository;

    @Autowired
    public ArticlesRestController(ArticlesRepository articlesRepository) {
        this.articlesRepository = articlesRepository;
    }

    @GetMapping("/all")
    public List<Article> showAll() {
        return articlesRepository.getAll();
    }

    @GetMapping("/client")
    public List<Article> showAllByClient(@RequestParam("name") String name) {
        return articlesRepository.getAllByClient(name);
    }

    @GetMapping("/magazine")
    public List<Article> showAllByMagazine(@RequestParam("name") String name) {
        return articlesRepository.getAllByMagazine(name);
    }

    @GetMapping("/author")
    public List<Article> showAllByAuthor(@RequestParam("name") String name) {
        return articlesRepository.getAllByAuthor(name);
    }

    @PostMapping("/add")
    public void addArticle(@RequestBody Article article) {
        articlesRepository.addArticle(article);
    }
}
