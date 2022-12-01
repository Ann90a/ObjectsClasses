public class Main {
    public static void main(String[] args) {


        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Михаил", "Лермонтов");

        Book book1 = new Book("Евгений Онегин", 1823, author1);
        Book book2 = new Book("Герой нашего времни", 1839, author2);
    }
}