package library;

public class Library {
    public static void main(String[] args) {
        Book livro01 = new Book("Crime e Castigo", 500, true);
        Book livro02 = new Book("Meditacoes", 120, true);

        Member membro01 = new Member("Gabriel dos Santos", 0001);

        livro01.showInfos();
        livro02.showInfos();

        membro01.showInfos();

    
    }
}
