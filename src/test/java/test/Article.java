package test;

import java.util.List;


/**
 * An article class with a list of authors, and the article that can have more than one author.
 */
public class Article {
    private List<Author> listOfAuthors;
    private int id;
    private String name;

    public Article(String name) {
        this.name = name;
    }

    public Article(List<Author> listOfAuthors, int id) {
        this.listOfAuthors = listOfAuthors;
        this.id = id;
    }

    public List<Author> getListOfAuthors() {
        return listOfAuthors;
    }

    public void setListOfAuthors(List<Author> listOfAuthors) {
        this.listOfAuthors = listOfAuthors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
