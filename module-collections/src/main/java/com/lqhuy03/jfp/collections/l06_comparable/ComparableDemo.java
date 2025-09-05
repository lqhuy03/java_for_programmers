package com.lqhuy03.jfp.collections.l06_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // So sánh theo tuổi (ascending)
    @Override
    public int compareTo(Employee emp) {
        return this.age - emp.age;
        // Hoặc: return Integer.compare(this.age, emp.age);
    }

    // Override toString để in thông tin Employee dễ hơn
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        // Tạo danh sách nhân viên
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Jane", 29));
        list.add(new Employee("Alex", 54));
        list.add(new Employee("Tom", 35));
        list.add(new Employee("Bob", 25));

        System.out.println("Before sorting:");
        System.out.println(list);

        // Sắp xếp danh sách theo tuổi (dùng Comparable)
        Collections.sort(list);

        System.out.println("After sorting by age (asc):");
        System.out.println(list);
    }
}
