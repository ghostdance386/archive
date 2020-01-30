package com.polishagency.archive;

import com.polishagency.archive.transferobjects.Article;

import java.util.List;

public interface ArticlesRepository {

    List<Article> findAll();

    List<Article> getArticleByClient_Name(String clientName);

    List<Article> getArticleByMagazine_Name(String magazineName);

    List<Article> getArticleByAuthor_Name(String authorName);

    Article save(Article article);

}
