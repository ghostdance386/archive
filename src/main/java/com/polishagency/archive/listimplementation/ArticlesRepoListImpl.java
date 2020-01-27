package com.polishagency.archive.listimplementation;

import com.polishagency.archive.ArticlesRepository;
import com.polishagency.archive.transferobjects.Article;
import com.polishagency.archive.transferobjects.Author;
import com.polishagency.archive.transferobjects.Client;
import com.polishagency.archive.transferobjects.Magazine;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class ArticlesRepoListImpl implements ArticlesRepository {


    private static List<Article> articlesList = new ArrayList<>();

    public ArticlesRepoListImpl() {
        RandomArticleGenerator generator = new RandomArticleGenerator();
        for (int i = 0; i < 40; i++) {
            articlesList.add(i, new Article()
                    .setId(i)
                    .setMagazine(new Magazine().setId(i).setName(generator.randomMagazine()))
                    .setClient(new Client().setId(i).setName(generator.randomClient()))
                    .setAuthor(new Author().setId(i).setName(generator.randomAuthor()))
                    .setSize(generator.randomSize())
                    .setLocalDate(LocalDate.now()));
        }

    }


    @Override
    public List<Article> getAll() {
        return articlesList;
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
