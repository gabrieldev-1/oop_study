package library;
import java.util.ArrayList;

public class Database {
    public static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<Member> members = new ArrayList<>();
    
    static {
        books.add(new Book("Crime e Castigo", 500, true));
        books.add(new Book("Meditacoes", 120, true));
        books.add(new Book("Gerra e Paz", 900, true));
        books.add(new Book("Crepusculo dos Idolos", 200, true));
        books.add(new Book("O Idiota", 700, true));
        books.add(new Book("Sobre a Breviedade da Vida", 150, true));

        members.add(new Member("Gabriel dos Santos", 1));
        members.add(new Member( "Guilherme Montovani", 2));
        members.add(new Member( "Maria Eduarda Lopes", 3));
    }
}
