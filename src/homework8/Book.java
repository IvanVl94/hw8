package homework8;

public class Book {
    private String title;
    private Authors authors;
    private int year;

    public Book (String title, Authors authors, int year){
        this.title = title;
        this.authors = authors;
        this.year = year;
    }
    public String getTitle(){
        return this.title;
    }

    public Authors getAuthors() {
        return authors;
    }

    public  int getYear(){
        return this.year;
    }
    public void setYear (int year) {
        this.year = year;
    }
}
