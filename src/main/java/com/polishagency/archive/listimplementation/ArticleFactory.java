package com.polishagency.archive.listimplementation;

import com.polishagency.archive.transferobjects.Article;
import com.polishagency.archive.transferobjects.Author;
import com.polishagency.archive.transferobjects.Client;
import com.polishagency.archive.transferobjects.Magazine;

import java.time.LocalDate;
import java.util.Random;

public class ArticleFactory {

    String[] magazineNames = {"Monitor Rynkowy", "Strefa Gospodarki", "Quality Today", "Rzecz O"};
    String[] authorNames = {"Bogdan Leszczorz", "Marcin Pawlenka", "Krzystof Kozioł", "Małgorzata Wawak"};
    String[] clientNames = {"SM Lazurowa", "INTiBS PAN", "Miasto Rzeszów", "Politechnika Gdańska"};
    double[] sizes = {0.25, 0.5, 0.75, 0.16, 0.33};

    public Article createArticle(long id) {
        return new Article()
                .setArticleId(id)
                .setMagazine(new Magazine().setMagazineId(id).setName(randomMagazine()))
                .setClient(new Client().setClientId(id).setName(randomClient()))
                .setAuthor(new Author().setAuthorId(id).setName(randomAuthor()))
                .setSize(randomSize())
                .setLocalDate(LocalDate.now());

    }

    public String randomMagazine() {
        return magazineNames[new Random().nextInt(magazineNames.length)];
    }

    public String randomAuthor() {
        return authorNames[new Random().nextInt(authorNames.length)];
    }

    public String randomClient() {
        return clientNames[new Random().nextInt(clientNames.length)];
    }

    public double randomSize() {
        return sizes[new Random().nextInt(sizes.length)];
    }

}
