package person;

public class TestPerson {
    public static void main(String[] args) {
        Person personOne = new Person("Gabriel", 19, 70, 1.70);

        personOne.apresentar();
        System.out.println(String.format("%.2f", personOne.calcImc()));

    }
}
