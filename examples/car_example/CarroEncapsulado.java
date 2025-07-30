package examples.car_example;

public class CarroEncapsulado {
    // Atributos privados (encapsulados)
    private String modelo;
    private String marca;
    private double velocidadeAtual;

    public CarroEncapsulado(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeAtual = 0.0;

    }

    // metodos para ler atributos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // metodos para alterar atributos
    public void setMarca(String marca) {
        if (marca != null && !modelo.trim().isEmpty()) {
            this.marca = marca;
            System.out.println("Marca " + marca + " Setada com secesso");

        } else {

            System.out.println("Essa marca e invalida");
        }
        
    }

    public void setModelo(String modelo) {
        if(modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
            System.out.println("Modelo " + modelo + " Setado com sucesso");

        } else {
            System.out.println("Esse modelo e invalido");

        }
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadeAtual += incremento;
            System.out.println("Carro acelerado a: " + this.velocidadeAtual);

        } else {
            System.out.println("Velocidade invalida");

        }
    }
}

