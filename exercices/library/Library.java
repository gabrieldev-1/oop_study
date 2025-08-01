package library;

public class Library {
    public static void main(String[] args) {
        Book livro01 = new Book("Crime e Castigo", 500, true);
        Book livro02 = new Book("Meditacoes", 120, true);
        Book livro03 = new Book("Gerra e Paz", 900, true);
        Book livro04 = new Book("Crepusculo dos Idolos", 200, true);
        Book livro05 = new Book("O Idiota", 700, true);
        Book livro06 = new Book("Sobre a Breviedade da Vida", 150, true);

        Member membro01 = new Member("Gabriel dos Santos", 0001);

        membro01.lendBook(livro01);
        membro01.lendBook(livro02);
        membro01.lendBook(livro03);
        membro01.lendBook(livro04);
        membro01.lendBook(livro05);
        membro01.lendBook(livro06);


        membro01.showInfos();
  
    
    }
}
