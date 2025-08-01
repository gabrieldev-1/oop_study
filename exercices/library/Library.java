package library;
import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Crime e Castigo", 500, true));
        books.add(new Book("Meditacoes", 120, true));
        books.add(new Book("Guerra e Paz", 900, true));
        books.add(new Book("Crepusculo dos Idolos", 200, true));
        books.add(new Book("O Idiota", 600, true));
        books.add(new Book("Sobre a Breviedade da Vida", 150, true));

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member("Gabriel dos Santos",0001));
        members.add(new Member("Guilherme Montovani", 0002));
        members.add(new Member("Maria Eduarda Lopes", 0003));
    }
}
