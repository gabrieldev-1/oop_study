public class Biblioteca {
    // Atibutos;
    String name;
    private float price;
    int pagNumbers;

    // Metodos;
    public void showInfo() {
        System.out.println("------ Livro 01 ------");
        System.out.println("nome: " + name);
        System.out.println("Preco: " +  price);
        System.out.println("Numero de paginas: " + pagNumbers);
        System.out.println("----------------------");

    }

    public static void main(String[] args) {

        // Adicionando um livro a biblioteca;
        Biblioteca livro01 = new Biblioteca();
        livro01.name = "Crime e Castigo";
        livro01.price = 90;
        livro01.pagNumbers = 500;

        livro01.showInfo();

    }
}
