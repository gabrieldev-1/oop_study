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

    public void lendBook(Book book) {
        if (book.getStatus().equals("Disponivel")) {
            for(int i = 0; i < borrowedBooks.length; i++) {
                if(borrowedBooks[i] == null) {
                    borrowedBooks[i] = book;
                    book.setStatus(false);
                    System.out.println("Livro " + book.getName() + " emprestado com sucesso");
                    return;
 
                }
            }
            System.out.println("Voce atingiu o limite maximo de livros emprestados por membro. Devolva ao menos um para emprestar outro.");

        } else {
            System.out.println("O livro esta indisponivel");

        }
    }

    public void returnBook(Book book) {
        for(int i = 0; i < borrowedBooks.length; i++) {
            if(borrowedBooks[i].getName() == book.getName()) {
                borrowedBooks[i] = null;
                book.setStatus(true);
                System.out.println("Livro de volvido com sucesso!");
                return;
            }
        }
        System.out.println("O membro " + this.getName() + " nao emprestou esse livro.");
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