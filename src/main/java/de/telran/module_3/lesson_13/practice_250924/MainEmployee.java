package de.telran.module_3.lesson_13.practice_250924;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Peter", "Manager", "Sale", 12000);
        Employee employee2 = new Employee("Markus", "Worker", "Sale", 1500);
        Employee employee3 = new Employee("Ira", "Manager", "Warehouse", 3000);
        Employee employee4 = new Employee("Taisia", "Boss", "Topoffice", 25000);
        Employee employee5 = new Employee("Olga", "Sekreterin", "Topoffice", 4000);
        Employee employee6 = new Employee("Igor", "Worker", "Sale", 4000);
        Employee employee7 = new Employee("Adam", "Bossdriver", "Topoffice", 4000);
        Employee employee8 = new Employee("Alex", "It", "Topoffice", 10000);
        Employee employee9 = new Employee("Rafael", "Worker", "Warehouse", 250);
        Employee employee10 = new Employee("Masha", "Putyfrau", "Warehouse", 1200);

        List<Employee> listEmp = new ArrayList<>(List.of(
                employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10));

        // 2.Получить список сотрудников с зп > 3000
        listEmp.stream()
                .filter(x -> x.getSalary() > 3000)
                .forEach(System.out::println);

        //3. Вычислить среднюю зарплату всех сотрудников
        Double avg = listEmp.stream()
                .mapToInt(x -> x.getSalary())
                .average().getAsDouble();
        System.out.println(avg);

        //4*. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
        // нужно использ. такой подход , нужно создавать новый источник данніх
        listEmp.stream()
                .filter(x -> x.getDepartment().equals("Sale"))
                .map(x -> new Employee(x.getName(), x.getPosition(), x.getDepartment(), (int) (x.getSalary() * 1.15)))
                .forEach(System.out::println);

        System.out.println();
        // желательно такой подход не использ. , он меняет данніе в источнике данніх
        listEmp.stream()
                .filter(x -> x.getDepartment().equals("Sale"))
                .peek(x -> x.setSalary((int) (x.getSalary() * 1.15)))
                .forEach(System.out::println);

        System.out.println(listEmp);

        //5*. Получить сотрудника с самой низкой зп , тут только зп
        System.out.println(listEmp.stream()
                .mapToInt(x -> x.getSalary())
                .min()
                .getAsInt());

        //5*. Получить сотрудника с самой высокой зп , тут сотрудник с зп
        System.out.println(listEmp.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get());

    }
}
