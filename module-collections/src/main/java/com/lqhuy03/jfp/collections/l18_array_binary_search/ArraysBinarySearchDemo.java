package com.lqhuy03.jfp.collections.l18_array_binary_search;

import java.util.Arrays;

// Lớp Employee
class Employee {
    int empId;
    String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return empId + " - " + empName;
    }
}

public class ArraysBinarySearchDemo {

    public static void main(String[] args) {
        // 1️⃣ Tìm kiếm trong mảng int (đã sắp xếp)
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("Index của số 4: " + index); // Kết quả: 3

        // 2️⃣ Tìm kiếm trong một phần mảng (sub-array)
        // Phạm vi [5, 9) => chỉ xét các phần tử index 5 → 8
        int indexPartial = Arrays.binarySearch(numbers, 5, 9, 4);
        System.out.println("Tìm số 4 trong phạm vi index 5–8: " + indexPartial); // Có thể trả giá trị âm (không tìm thấy)

        indexPartial = Arrays.binarySearch(numbers, 1, 5, 4);
        System.out.println("Tìm số 4 trong phạm vi index 1–4: " + indexPartial); // Tìm thấy

        // 3️⃣ Tìm kiếm trong mảng đối tượng Employee bằng Comparator
        Employee[] employees = {
            new Employee(123, "Jay"),
            new Employee(124, "Roy"),
            new Employee(125, "Nikki"),
            new Employee(126, "Tom")
        };

        // Phải sắp xếp mảng trước khi binarySearch
        Arrays.sort(employees, (emp1, emp2) -> emp1.empId - emp2.empId);

        // Tìm nhân viên có empId = 124
        int empIndex = Arrays.binarySearch(
            employees,
            new Employee(124, "Roy"),
            (emp1, emp2) -> emp1.empId - emp2.empId
        );

        System.out.println("Index của nhân viên empId=124: " + empIndex);
        if (empIndex >= 0) {
            System.out.println("Nhân viên tìm thấy: " + employees[empIndex]);
        } else {
            System.out.println("Không tìm thấy nhân viên.");
        }
    }
}
