package animal_example;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;

    }

    public void comer() {
        System.out.println("*comendo...*");
    }

    public void dormir() {
        System.out.println("*dormindo...*");
    }
}
