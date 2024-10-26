public class EmployeeTest {
    public static void main(String[] args) {
        // Criação de objetos Employee
        Employee employee1 = new Employee("Carlos", "Silva", 3000);
        Employee employee2 = new Employee("Ana", "Souza", -1500); // Salário inválido
        Employee employee3 = new Employee("João", "Pereira", 4000);

        // Exibição do salário anual de cada empregado
        System.out.printf("Salário anual de %s %s: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getAnnualSalary());
        System.out.printf("Salário anual de %s %s: %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.getAnnualSalary());
        System.out.printf("Salário anual de %s %s: %.2f%n", employee3.getFirstName(), employee3.getLastName(), employee3.getAnnualSalary());

        // Aumentar os salários em 10%
        employee1.increaseSalary();
        employee2.increaseSalary();
        employee3.increaseSalary();


        System.out.println("\nApós aumento de 10%:");
        System.out.printf("Salário anual de %s %s: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getAnnualSalary());
        System.out.printf("Salário anual de %s %s: %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.getAnnualSalary());
        System.out.printf("Salário anual de %s %s: %.2f%n", employee3.getFirstName(), employee3.getLastName(), employee3.getAnnualSalary());
    }
}
