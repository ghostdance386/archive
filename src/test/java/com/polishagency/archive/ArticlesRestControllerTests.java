package com.polishagency.archive;


import com.polishagency.archive.transferobjects.Article;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class ArticlesRestControllerTests {

    @Mock
    ArticlesRepository mockRepository;
    @Mock
    ArticlesRestController mockController;

    @Test
    public void givenFindAllMethodMocked_WhenUseFindAll_ThenMockValueReturned() {
        List<Article> allArticles = mockController.showAll();
        Mockito.when(mockRepository.findAll()).thenReturn(allArticles);
        Assert.assertEquals(mockRepository.findAll(), allArticles);
    }

    @Test
    public void givenGetByClientMethodMocked_WhenUseGetByClient_ThenMockValueReturned() {
        List<Article> clientArticles = mockController.showAllByClient("SM Lazurowa");
        Mockito.when(mockRepository.getArticleByClient_Name("SM Lazurowa")).thenReturn(clientArticles);
        Assert.assertEquals(mockRepository.getArticleByClient_Name("SM Lazurowa"), clientArticles);
    }

    @Test
    public void givenGetByMagazineMethodMocked_WhenUseGetByMagazine_ThenMockValueReturned() {
        List<Article> magazineArticles = mockController.showAllByMagazine("Monitor Rynkowy");
        Mockito.when(mockRepository.getArticleByMagazine_Name("Monitor Rynkowy")).thenReturn(magazineArticles);
        Assert.assertEquals(mockRepository.getArticleByMagazine_Name("Monitor Rynkowy"), magazineArticles);
    }

    @Test
    public void givenGetByAuthorMethodMocked_WhenUseGetByAuthor_ThenMockValueReturned() {
        List<Article> authorArticles = mockController.showAllByAuthor("Bogdan Leszczorz");
        Mockito.when(mockRepository.getArticleByAuthor_Name("Bogdan Leszczorz")).thenReturn(authorArticles);
        Assert.assertEquals(mockRepository.getArticleByAuthor_Name("Bogdan Leszczorz"), authorArticles);
    }

    @Test
    public void givenSaveMethodMocked_WhenUseSave_ThenMockValueReturned() {
        Article article = new Article();
        article = mockController.addArticle(article);
        Mockito.when(mockRepository.save(article)).thenReturn(article);
        Assert.assertEquals(article, mockRepository.save(article));
    }

}
