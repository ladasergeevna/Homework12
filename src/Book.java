import java.util.Objects;

public class Book {
    private final String  title;
    private final Author author;
    private int yearPublication;


    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;

    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Название = '" + title + '\'' +
                ", Автор=" + author +
                ", Год публикации = " + yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublication);
    }
}
