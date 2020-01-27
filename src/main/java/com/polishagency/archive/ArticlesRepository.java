package com.polishagency.archive;

import com.polishagency.archive.transferobjects.Article;

import java.util.List;

public interface ArticlesRepository {

    List<Article> getAll();

    List<Article> getAllByClient(String clientName);

    List<Article> getAllByMagazine(String magazineName);

    List<Article> getAllByAuthor(String authorName);

    void addArticle(Article article);

}
