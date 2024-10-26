public class Employee {
    private String firstName;
    private String lastName;
    private double mes;

    public Employee(String firstName, String lastName, double mes) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMes(mes);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMes() {
        return mes;
    }

    public void setMes(double mes) {
        if (mes > 0) {
            this.mes = mes;
        } else {
            System.out.println("O salário mensal deve ser positivo.");
        }
    }


    public double getAnnualSalary() {
        return mes * 12;
    }


    public void increaseSalary() {
        mes *= 1.10; // Aumenta em 10%
    }
}
