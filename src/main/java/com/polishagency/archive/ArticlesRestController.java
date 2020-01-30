package com.polishagency.archive;

import com.polishagency.archive.transferobjects.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class ArticlesRestController {

    private ArticlesRepository articlesRepository;

    @Autowired
    public ArticlesRestController(@Qualifier("articlesHibernateRepository") ArticlesRepository articlesRepository) {
        this.articlesRepository = articlesRepository;
    }

    @GetMapping("/all")
    public List<Article> showAll() {
        return articlesRepository.findAll();
    }

    @GetMapping("/client")
    public List<Article> showAllByClient(@RequestParam("name") String clientName) {
        return articlesRepository.getArticleByClient_Name(clientName);
    }

    @GetMapping("/magazine")
    public List<Article> showAllByMagazine(@RequestParam("name") String magazineName) {
        return articlesRepository.getArticleByMagazine_Name(magazineName);
    }

    @GetMapping("/author")
    public List<Article> showAllByAuthor(@RequestParam("name") String authorName) {
        return articlesRepository.getArticleByAuthor_Name(authorName);
    }

    @PostMapping("/add")
    public void addArticle(@RequestBody Article article) {
        articlesRepository.save(article);
    }
}
