package library;

public class Book {
    // Atibutos;
    private String name;
    private int numberOfPages;
    private boolean status;

    public Book(String name, int numberOfPages, boolean status) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;

    }
    public String getStatus() {
        return status ? "Disponivel" : "Indisponivel";
    }

    public void setStatus(boolean newStatus) {
        this.status = newStatus;
    }

    public void showInfos() {
        System.out.println("------ Informacoes do livro ------");
        System.out.println("Nome: " + this.getName());
        System.out.println("Numero de paginas: " + this.getNumberOfPages());
        System.out.println("Status do livro: " + this.getStatus());
        System.out.println("----------------------------------");
    }
}
