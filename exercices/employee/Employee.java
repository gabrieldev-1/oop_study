package employee;

public class Employee {
    private String name;
    private String registration;
    private double wage;

    public Employee(String name, String registration, double wage) {
        this.name = name;
        this.registration = registration;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public String getRegistration() {
        return registration;
    }

    public double getWage() {
        return wage;
    }

    public void setName(String newName) {
        if(newName == this.name) {
            System.out.println("Este funcionario ja possui este nome.");

        } else {
            this.name = newName;
            System.out.println("Nome definido com sucesso.");
        }
    }

    public void setRegistration(String newRegistration) {
        if(newRegistration == this.registration) {
            System.out.println("Esse funcionario ja possui esse registro.");

        } else {
            this.registration = newRegistration;
            System.out.println("Novo registro definido com sucesso");
        }
    }
    public void setWage(double newWage) {
        if(newWage == this.wage) {
            System.out.println("Esse funcionario ja possui esse salario.");

        } else if (newWage < 0) {
            System.out.println("Esse salario e invalido.");

        } else {
            this.wage = newWage;
        }
    }

    public double annualSalary() {
        return wage * 12;
    }

    public void exibirDetalhes() {
        System.out.println("----------Funcionario----------");
        System.out.println("Nome: " + name);
        System.out.println("Registro: " + registration);
        System.out.println("Salario: " + wage);
        System.out.println("Salario anual: " + this.annualSalary());
        System.out.println("-------------------------------");
    }
}
