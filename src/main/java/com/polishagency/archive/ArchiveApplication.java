package com.polishagency.archive;

import com.polishagency.archive.listimplementation.ArticlesRepoListImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArchiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchiveApplication.class, args);

        ArticlesRepoListImpl articlesRepoList = new ArticlesRepoListImpl();

        System.out.println(articlesRepoList.getAll().toString());
    }

}
