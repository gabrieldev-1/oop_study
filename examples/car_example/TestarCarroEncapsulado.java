package examples.car_example;

public class TestarCarroEncapsulado {
    public static void main(String[] args) {

        CarroEncapsulado meuCarro = new CarroEncapsulado("Supra", "Toyota");

        // Acessando os atributos via metodos "set"
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());

        // modificando os atributos via metodos "get"
        meuCarro.setModelo("Corolla");
        System.out.println(meuCarro.getModelo());
    }
}
