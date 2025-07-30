package animal_example;

public class testarAnimal {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex", 10, "Labrador");
        
        Gato meuGato = new Gato("Frajola", 10, "Braco e Preto");


        System.out.println("--------------------------");

        // Metodos herdados:
        System.out.println(meuCachorro.getNome());
        System.out.println(meuCachorro.getIdade());
        meuCachorro.comer();

        // Metodos expecificos:
        System.out.println(meuCachorro.getRaca());        meuCachorro.latir();

        System.out.println("--------------------------");

        // Metodos herdados:
        System.out.println(meuGato.getNome());
        System.out.println(meuGato.getIdade());
        meuGato.comer();

        // Metodos expecificos:
        System.out.println(meuGato.getCorPelo());
        meuGato.miar();

        System.out.println("--------------------------");

    }
}
