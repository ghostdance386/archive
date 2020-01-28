package com.polishagency.archive.databaseimplementation;

import com.polishagency.archive.ArticlesRepository;
import com.polishagency.archive.transferobjects.Article;

import java.util.List;

public class ArticlesRepoDbImpl implements ArticlesRepository {


    @Override
    public List<Article> getAll() {
        return null;
    }

    @Override
    public List<Article> getAllByClient(String clientName) {
        return null;
    }

    @Override
    public List<Article> getAllByMagazine(String magazineName) {
        return null;
    }

    @Override
    public List<Article> getAllByAuthor(String authorName) {
        return null;
    }

    @Override
    public void addArticle(Article article) {

    }
}
