package animal_example;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade); // Chama o construtor da superclasse animal;
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    // Metodos expecificos da classe cachorro
    public void latir() {
        System.out.println(getNome()+":*Au au!*");

    }

    // Sobrescrita de metodos;
    @Override // indica a sobrescrita(e uma boa pratica)
    public void comer() {
        System.out.println(getNome()+ " esta comendo racao de cachorro.");
    }
}
