package test;

/**
 * A class to count authors while traversing a stream of authors.
 * Then the class will perform a reduction on the stream
 */
public class RelatedAuthorCounter {
    private final int counter;
    private final boolean isRelated;

    public RelatedAuthorCounter(int counter, boolean related) {
        this.counter = counter;
        isRelated = related;
    }

    public RelatedAuthorCounter accumulate(Author author) {
        if(author.getRelatedArticleId() == 0){
            return isRelated ? this : new RelatedAuthorCounter(counter, true);
        }
        else {
            return isRelated ? new RelatedAuthorCounter(counter + 1, false) : this;
        }
    }
}
