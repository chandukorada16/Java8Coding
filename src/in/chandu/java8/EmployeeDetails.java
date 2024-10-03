package in.chandu.java8;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDetails {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
        employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
        employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
        employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
        employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
        employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
        employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
        employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
        employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
        employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
        employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
        employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

        System.out.println("Male and Female Count Of Organization "+genderCount(employeeList));
        System.out.println("Department Names "+listOfDepNames(employeeList));
        System.out.println("Average Age Of male and Female Employees "+avgAgeOfMaleAndFemaleEmp(employeeList));
        System.out.println("Most Expensive Employee In Org "+highestPaidEmpInOrganization(employeeList));
        System.out.println("Employees Names Joined After 2015 in this Org "+employeesJoinedAfter2015(employeeList));
        System.out.println("Number Of Employees "+numberOfEmployeesInOrganization(employeeList));
        System.out.println("Average Salary Of Each Dep "+averageSalaryOfEachDep(employeeList));
        System.out.println("Second Highest Salary In Organization "+secondHighestSalaryInEmpList(employeeList));
        System.out.println("Youngest Male Employee In Development Department "+youngestMaleEmpInDevelopment(employeeList));
        System.out.println("Most Working Experience In Organization "+mostWorkingExperienceInOrg(employeeList));
        System.out.println("Male & Female Count In Sales Department "+maleFemaleSales(employeeList));
        System.out.println("Names Of All Departments "+namesOfAllDepartments(employeeList));
        System.out.println("Sum Of total Salary Of Organization "+sumOfTotalSalaryOfOrganization(employeeList));
        System.out.println("Average Salary Of Organization "+avgSalaryOfOrganization(employeeList));
        separateAgeBelowAfter25(employeeList);
        System.out.println("Younger Employee in This Organization "+youngerEmployeeInOrg(employeeList));
        System.out.println("Sorted Employees Based On EmpName "+sortedEmployeesBasedOnName(employeeList));
        System.out.println("Sorted Employees Based On EmpSalary "+sortedEmployeesBasedOnSalary(employeeList));
        System.out.println("Sorted Employees Based On EmpSalary In Desc "+sortedEmployeesBasedOnSlaryInDesc(employeeList));
        System.out.println("Top Three Paid Employees "+topThreeHighestPaidEmployees(employeeList));
        System.out.println("Maximum Salary Salary In Each Department "+maxSalaryEmpInEachDep(employeeList));
        System.out.println("Number Of Employees With Age 27 "+countNumberOfEmpAge27(employeeList));
        System.out.println("find Employee Details With Gita's Name "+findEmpDetailsGitaName(employeeList));
        System.out.println("Incresed Salary All Employees "+increaseSalaryAllEmpInOrg(employeeList));
        increaseSalaryInSpecificDep(employeeList);
        System.out.println("Average Salary Of Each Gender In Emp List "+averageSalaryOfEachGenderInEmpList(employeeList));
        System.out.println("Maximum Employees In Each Department "+maxEmployeesInDep(employeeList));
        System.out.println("Employees Names Age Between 20 And 30 "+employeesBetweenAge20And30(employeeList));
        System.out.println("Sorted Employees In Development Role based on empName "+sortEmpBasedOnDevlopmentRole(employeeList));
        System.out.println("Based On Department Employee Details "+employeesBasedOnDep(employeeList));
        System.out.println("Number Of Employees In Each Dep "+numOfEmpOfEachDep(employeeList));
        System.out.println("Minimum Salary Of Each Department "+minSalaryEmpInEachDep(employeeList));
        System.out.println("Sum Of Age in All Employees in this Organization "+sumOfAge(employeeList));
        System.out.println("Average Of Age in All Employees in this Organization "+avgOfAge(employeeList));
    }

    private static Map<String, Long> genderCount(List<Employee> employeeList) {

        Map<String, Long> maleFemaleCountOfEmpList = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        return maleFemaleCountOfEmpList;
    }

    private static List<String> listOfDepNames(List<Employee> employeeList) {

        List<String> depNames = employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.toList());
        return depNames;

    }

    private static Map<String,Double> avgAgeOfMaleAndFemaleEmp(List<Employee> employeeList){
        Map<String, Double> avgAgeGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        return avgAgeGender;
    }

    private static Employee highestPaidEmpInOrganization(List<Employee> employeeList){
        Employee employee = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
                .get();
        return employee;
    }

    private static List<String> employeesJoinedAfter2015(List<Employee> employeeList){
        List<String> empJoinedAfter2015 = employeeList.stream()
                .filter(emp -> emp.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .collect(Collectors.toList());
        return empJoinedAfter2015;
    }

    private static long numberOfEmployeesInOrganization(List<Employee> employeeList){
        long count = employeeList.stream().count();
        return count;
    }

    private static Map<String,Double> averageSalaryOfEachDep(List<Employee> employeeList){
        Map<String, Double> avgSalaryOfEachDep = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        return avgSalaryOfEachDep;
    }

    private static Employee secondHighestSalaryInEmpList(List<Employee> employeeList) {

        Employee secondHighSal = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .get();
        return secondHighSal;
    }
    private static Employee youngestMaleEmpInDevelopment(List<Employee> employeeList){
        Employee emp = employeeList.stream()
                .filter(i->i.getDepartment().equals("Development"))
                .min(Comparator.comparing(Employee::getAge))
                .get();
        return emp;
    }
    private static Employee mostWorkingExperienceInOrg(List<Employee> employeeList){
        Employee emp = employeeList.stream()
                .min(Comparator.comparing(Employee::getYearOfJoining))
                .get();
        return emp;
    }
    private static Map<String,Long> maleFemaleSales(List<Employee> employeeList){
        Map<String, Long> salesCount = employeeList.stream()
                .filter(i -> i.getDepartment().equals("Sales"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        return salesCount;
    }

    private static Map<String, List<String>> namesOfAllDepartments(List<Employee> employeeList){
        Map<String, List<String>> namesEachDepect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        return namesEachDepect;
    }

    private static double sumOfTotalSalaryOfOrganization(List<Employee> employeeList){
        double sum = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary))
                .getSum();
        return sum;
    }

    private static Double avgSalaryOfOrganization(List<Employee> employeeList){
        Double avg = employeeList.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        return avg;
    }

    private static  void separateAgeBelowAfter25(List<Employee> employeeList) {
        Map<Boolean, List<Employee>> employeeMap = employeeList.stream()
                .collect(Collectors.partitioningBy(
                        e -> e.getAge() <= 25,
                        Collectors.toList()
                ));
        List<Employee> youngerEmployees = employeeMap.get(true);
        List<Employee> olderEmployees = employeeMap.get(false);

        System.out.println("Employees younger or equal to 25:");
        youngerEmployees.forEach(e -> System.out.println(e.getName() + ", " + e.getAge() + ", " + e.getSalary()));

        System.out.println("\nEmployees older than 25:");
        olderEmployees.forEach(e -> System.out.println(e.getName() + ", " + e.getAge() + ", " + e.getSalary()));
    }

    private static Employee youngerEmployeeInOrg(List<Employee> employeeList){
        Employee youngEmp = employeeList.stream()
                .min(Comparator.comparing(Employee::getAge))
                .get();
        return youngEmp;
    }

    private static List<Employee> sortedEmployeesBasedOnName(List<Employee> employeeList){
        List<Employee> sortedByName = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        return sortedByName;
    }

    private static List<Employee> sortedEmployeesBasedOnSalary(List<Employee> employeeList){
        List<Employee> sortedBySalary = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        return sortedBySalary;
    }

    private static List<Employee> sortedEmployeesBasedOnSlaryInDesc(List<Employee> employeeList){
        List<Employee> sortedBySalaryDesc = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        return sortedBySalaryDesc;
    }

    private static List<Employee> topThreeHighestPaidEmployees(List<Employee> employeeList) {
        List<Employee> topThreePaidEmp = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());
        return topThreePaidEmp;

    }

    private static Map<String, Optional<Employee>> maxSalaryEmpInEachDep(List<Employee> employeeList) {
        Map<String, Optional<Employee>> maxSalInEachDep = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        return maxSalInEachDep;
    }

    private static long countNumberOfEmpAge27(List<Employee> employeeList){
        long countWith27 = employeeList.stream()
                .filter(emp -> emp.getAge() == 27)
                .count();
        return countWith27;
    }

    private static Employee findEmpDetailsGitaName(List<Employee> employeeList){
        Employee gitaDetails = employeeList.stream()
                .filter(emp -> emp.getName().equals("Gita"))
                .findAny()
                .get();
        return gitaDetails;
    }

    private static List<Employee> increaseSalaryAllEmpInOrg(List<Employee> employeeList){
        List<Employee> incresedSalary = employeeList.stream()
                .map(e -> {
                    e.setSalary(e.getSalary() * 1.1);
                    return e;
                })
                .collect(Collectors.toList());
        return incresedSalary;

    }

    private static void increaseSalaryInSpecificDep(List<Employee> employeeList){
        employeeList.stream()
                .filter(e -> e.getDepartment().equals("Development"))
                .forEach(e -> e.setSalary(e.getSalary() * 1.3));
        employeeList.forEach(System.out::println);
    }

    private static Map<String,Double> averageSalaryOfEachGenderInEmpList(List<Employee> employeeList) {
           Map<String, Double> avgSalaryGender = employeeList.stream()
                   .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
           return avgSalaryGender;
    }

    private static  Map.Entry<String, Long> maxEmployeesInDep(List<Employee> employeeList) {
        Map.Entry<String, Long> maxEmployeesInDep = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).get();
        return maxEmployeesInDep;
    }

    private static List<String> employeesBetweenAge20And30(List<Employee> employeeList) {
        List<String> employeesAge20To30 = employeeList.stream()
                .filter(emp -> emp.getAge() > 20 && emp.getAge() < 30)
                .map(Employee::getName)
                .collect(Collectors.toList());
        return employeesAge20To30;
    }

    private static List<Employee> sortEmpBasedOnDevlopmentRole(List<Employee> employeeList) {

        List<Employee> sortBasedOnDevNames = employeeList.stream()
                .filter(emp -> emp.getDepartment().equals("Development"))
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        return sortBasedOnDevNames;
    }

    private static Map<String, List<Employee>> employeesBasedOnDep(List<Employee> employeeList) {
        Map<String, List<Employee>> empBasedOnDepName = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        return empBasedOnDepName;
    }

    private static Map<String, Long> numOfEmpOfEachDep(List<Employee> employeeList) {
        Map<String, Long> numberOfEmpEachDep = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        return numberOfEmpEachDep;
    }

    private static Map<String, Optional<Employee>> minSalaryEmpInEachDep(List<Employee> employeeList) {
        Map<String, Optional<Employee>> minSalInEachDep = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        return minSalInEachDep;
    }

    private static Map<String, Integer> sumOfAge(List<Employee> employeeList){
        Map<String, Integer> maleFemaleAgeSum = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.summingInt(Employee::getAge)));
        return maleFemaleAgeSum;
    }
    private static Map<String, Double> avgOfAge(List<Employee> employeeList){
        Map<String, Double> maleFemaleAgeAvg = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        return maleFemaleAgeAvg;
    }

}
