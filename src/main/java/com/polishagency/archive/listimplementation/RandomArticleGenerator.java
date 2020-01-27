package com.polishagency.archive.listimplementation;

import java.util.Random;

public class RandomArticleGenerator {

    String[] magazineNames = {"Monitor Rynkowy", "Strefa Gospodarki", "Quality Today", "Rzecz O"};
    String[] authorNames = {"Bogdan Leszczorz", "Marcin Pawlenka", "Krzystof Kozioł", "Małgorzata Wawak"};
    String[] clientNames = {"SM Lazurowa", "INTiBS PAN", "Miasto Rzeszów", "Politechnika Gdańska"};
    double[] sizes = {0.25, 0.5, 0.75, 0.16, 0.33};

    public long randomId() {
        return new Random().nextInt(100);
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
