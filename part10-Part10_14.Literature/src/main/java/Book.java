

public class Book implements Comparable<Book>{
    private String bookName;
    private int ageRecommendation;

    public String getBookName() {
        return bookName;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    public Book(String bookName, int ageRecommendation){
        this.bookName = bookName;
        this.ageRecommendation = ageRecommendation;
    }
    @Override
    public String toString(){
        return this.bookName+" (recommended for "+this.ageRecommendation+" year-olds or older)";
    }

    @Override
    public int compareTo(Book o) {
        return this.getAgeRecommendation()-o.getAgeRecommendation();
    }

    

    
}
