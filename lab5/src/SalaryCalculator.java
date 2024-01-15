import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String name;
    String email;
    double hourRate;
    int capacity;
    int freeDays;

    public double calculateDailyIncome() {
        return hourRate * capacity;
    }

    public double calculateMonthlyIncome() {
        return calculateDailyIncome() * (21 - freeDays);
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti numarul de angajati (N): ");
        int n = scanner.nextInt();

        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Introduceti datele pentru angajatul " + i + ":");
            Employee employee = new Employee();

            System.out.print("Nume: ");
            employee.name = scanner.next();

            System.out.print("Email: ");
            employee.email = scanner.next();

            System.out.print("Tarif pe ora: ");
            employee.hourRate = scanner.nextDouble();

            System.out.print("Numar de ore lucrate pe zi: ");
            employee.capacity = scanner.nextInt();

            System.out.print("Numar de zile libere: ");
            employee.freeDays = scanner.nextInt();

            employees.add(employee);
        }

        System.out.println("\nSalariul lunar pentru fiecare angajat:");

        for (Employee employee : employees) {
            System.out.println(employee.name + ": " + employee.calculateMonthlyIncome());
        }
    }
}
