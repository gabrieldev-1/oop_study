package employee;

public class Maneger extends Employee {
    private String department;
    
    public Maneger(String name, String registration, double wage, String department) {
        super(name, registration, wage);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newDepartment) {
        if(newDepartment == this.department) {
            System.out.println("Este gerente ja faz parte desse departamento.");

        } else {
            this.department = newDepartment;
        }
    }

    @Override
    public void exibirDetalhes() { 
        System.out.println("----------Gerente--------------");
        System.out.println("Nome: " + getName());
        System.out.println("Registro: " + getRegistration());
        System.out.println("Salario: " + getWage());
        System.out.println("Salario anual: " + this.annualSalary());
        System.out.println("Departamento: " + getDepartment());
        System.out.println("-------------------------------");
    }
}
