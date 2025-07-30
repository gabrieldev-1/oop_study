package animal_example;

public class Gato extends Animal {
    private String corPelo;
    
    public Gato(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;

    }

    public String getCorPelo() {
        return corPelo;
    }

    public void miar() {
        System.out.println(getNome() + ":*Miau Miau!");

    }
    
}