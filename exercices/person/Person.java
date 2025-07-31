package person;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void apresentar() {
        System.out.println("Ola! meu nome e " + name + " e tenho " + age);

    }

    public double calcImc() {        
        return weight / (height * height);

    }
}
