package test;


/**
 *  An an author is related to the article if his related article’s id matches article id
 */
public class Author {

    private String name;
    private int relatedArticleId;

    public Author(String name, int relatedArticleId) {
        this.name = name;
        this.relatedArticleId = relatedArticleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelatedArticleId() {
        return relatedArticleId;
    }

    public void setRelatedArticleId(int relatedArticleId) {
        this.relatedArticleId = relatedArticleId;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", relatedArticleId=" + relatedArticleId +
                '}';
    }
}
