package com.polishagency.archive.databaseimplementation;

import com.polishagency.archive.ArticlesRepository;
import com.polishagency.archive.transferobjects.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ArticlesHibernateRepository extends JpaRepository<Article, Long>, ArticlesRepository {


    List<Article> findAll();

    List<Article> getArticleByClient_Name(String clientName);

    List<Article> getArticleByMagazine_Name(String magazineName);

    List<Article> getArticleByAuthor_Name(String authorName);

    Article save(Article article);


}
