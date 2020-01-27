package com.polishagency.archive.listimplementation;

import com.polishagency.archive.ArticlesRepository;
import com.polishagency.archive.transferobjects.Article;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ArticlesRepoListImpl implements ArticlesRepository {

    private static List<Article> articlesList = new ArrayList<>();

    public ArticlesRepoListImpl() {
        ArticleFactory factory = new ArticleFactory();
        for (int i = 0; i < 40; i++) {
            articlesList.add(factory.createArticle(i));
        }
    }


    @Override
    public List<Article> getAll() {
        return articlesList;
    }

    @Override
    public List<Article> getAllByClient(String clientName) {
        return articlesList.stream()
                .filter(article -> article.getClient().getName().equals(clientName))
                .sorted(Comparator.comparing(Article::getSize).reversed()
                        .thenComparing(Article::getLocalDate).reversed())
                .collect(Collectors.toList());
    }


    @Override
    public List<Article> getAllByMagazine(String magazineName) {
        return articlesList.stream()
                .filter(article -> article.getMagazine().getName().equals(magazineName))
                .sorted(Comparator.comparing(Article::getSize).reversed()
                        .thenComparing(Article::getLocalDate).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<Article> getAllByAuthor(String authorName) {
        return articlesList.stream()
                .filter(article -> article.getAuthor().getName().equals(authorName))
                .sorted(Comparator.comparing(Article::getSize).reversed()
                        .thenComparing(Article::getLocalDate).reversed())
                .collect(Collectors.toList());
    }


    @Override
    public void addArticle(Article article) {
        article.setId(articlesList.size());
        articlesList.add(article);
    }

}
