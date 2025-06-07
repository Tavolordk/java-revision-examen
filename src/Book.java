
public class Book {
    private int ISBN;
    private String title, author;
    private int pageCount;

    @Override
    public int hashCode() {
        return ISBN;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.ISBN == other.ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.author="Octavio";
        book.ISBN=1;
        book.pageCount=3;
        book.title="Programación con Java";
        System.out.println(book.toString());

        String s1 = "Canada";
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);
        if(s1 == s2)
            System.out.println("s1 == s2");
        if(s1.equals(s2))
            System.out.println("s1.equals(s2)");
    }
}
