package zadanie2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("J.K.", "Rowling", 56);
        System.out.println(author1.toString());

        Author author2 = new Author("Stephen", "King", 74);
        author2.setSurname("SKing");
        System.out.println(author2.toString());

        Author author3 = new Author("Agatha", "Christie", 85);
        System.out.println(author3.toString());
    }
}
