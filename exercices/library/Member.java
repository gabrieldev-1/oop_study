package library;

public class Member {
    private String name;
    private int id;
    private Book[] borrowedBooks; // Voce deve especificar tamanho e tipo de elemento;

    public Member(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new Book[5];
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void showInfos() {
        System.out.println("------ Informacoes do membro ------");
        System.out.println("Nome: " + this.getName());
        System.out.println("Id: " + this.getId());
        System.out.println("Livros emprestados: ");

        boolean hasBooks = false;
        for (Book book : borrowedBooks) { // E assim que se aplica um forEach em Java;
            if(book != null) {
                System.out.println(book.getName() + " | ");
                hasBooks = true;
            }
        }

        if (!hasBooks) {
            System.out.println("Nenhum livro foi emprestado.");
        }

        System.out.println("-----------------------------------");
    }
}