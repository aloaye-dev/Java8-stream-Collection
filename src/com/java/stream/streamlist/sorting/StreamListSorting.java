package com.java.stream.streamlist.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pawpaw");
        fruits.add("Mango");

        List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);

        //Sorting in Ascending Order.##

        //lambda Expression
        List<String> sortedList1 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sortedList1);

        List<String> sortedList2 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList2);

        System.out.println("########################################################");

        ////////////////Sorting in descending Order

        List<String> sortedList3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList3);


        //lambda Expression
        List<String> sortedList4 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sortedList4);

        System.out.println("############################################################################");

        // Sort Employee by salary in ascending order

        List<Employee> employee = new ArrayList<Employee>();
        employee.add(new Employee(10,"Ephraim", 30, 400000));
        employee.add(new Employee(20,"Crayon", 23, 320000));
        employee.add(new Employee(30,"Dan", 35, 210000));
        employee.add(new Employee(40,"Solomon", 28, 500000));

        List<Employee> employeeSortedList = employee.stream()
                .sorted((Employee o1, Employee o2) ->(int)(o1.getSalary() - o2.getSalary()))
                .collect(Collectors.toList());

        //Ascending order

        List<Employee> employeeSortedList1 =employee.stream().sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());
        //Descending order

        List<Employee> employeeSortedList2 =employee.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println(employeeSortedList2);
    }
}
