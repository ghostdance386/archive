package com.polishagency.archive.listimplementation;

import com.polishagency.archive.ArticlesRepository;
import com.polishagency.archive.dao.Article;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
    public List<Article> findAll() {
        return articlesList;
    }

    @Override
    public List<Article> getArticleByClient_Name(String clientName) {
        return articlesList.stream()
                .filter(article -> article.getClient().getName().equals(clientName))
                .sorted(Comparator.comparing(Article::getSize).reversed()
                        .thenComparing(Article::getLocalDate).reversed())
                .collect(Collectors.toList());
    }


    @Override
    public List<Article> getArticleByMagazine_Name(String magazineName) {
        return articlesList.stream()
                .filter(article -> article.getMagazine().getName().equals(magazineName))
                .sorted(Comparator.comparing(Article::getSize).reversed()
                        .thenComparing(Article::getLocalDate).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<Article> getArticleByAuthor_Name(String authorName) {
        return articlesList.stream()
                .filter(article -> article.getAuthor().getName().equals(authorName))
                .sorted(Comparator.comparing(Article::getSize).reversed()
                        .thenComparing(Article::getLocalDate).reversed())
                .collect(Collectors.toList());
    }


    @Override
    public Article save(Article article) {
        article.setArticleId(articlesList.size());
        articlesList.add(article);
        return article;
    }

    @Override
    public void deleteArticleByArticleId(long articleId) {
        Optional<Article> articleToDelete = articlesList.stream()
                .filter(article -> article.getArticleId() == articleId)
                .findFirst();
        System.out.println(articleToDelete.toString());
        articleToDelete.ifPresent(article -> articlesList.remove(article));
    }
}
