package employee;

public class TestEmployee {
    public static void main(String[] agrs) {
        Employee employee01 = new Employee("Gabriel dos Santos", "101223", 5000.00);
        Maneger maneger01 = new Maneger("Leandro", "01", 10000.00, "Sul");

        employee01.exibirDetalhes();
        maneger01.exibirDetalhes();
    }
}
