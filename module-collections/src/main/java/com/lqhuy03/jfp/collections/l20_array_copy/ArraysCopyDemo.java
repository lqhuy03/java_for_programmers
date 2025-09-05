package com.lqhuy03.jfp.collections.l20_array_copy;

import java.util.Arrays;

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

public class ArraysCopyDemo {
    public static void main(String[] args) {

        // 1️⃣ Copy mảng int cùng kích thước
        int[] numbers = {1, 2, 3, 4, 5};
        int[] copySameSize = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copy cùng kích thước: " + Arrays.toString(copySameSize));

        // 2️⃣ Copy mảng int với kích thước lớn hơn
        int[] copyBigger = Arrays.copyOf(numbers, 8); // Thêm phần tử = 0
        System.out.println("Copy với kích thước lớn hơn: " + Arrays.toString(copyBigger));

        // 3️⃣ Copy một phần mảng
        int[] copyPart = Arrays.copyOfRange(numbers, 1, 4); // index 1 → 3
        System.out.println("Copy một phần mảng (index 1→3): " + Arrays.toString(copyPart));

        // 4️⃣ Copy mảng chứa đối tượng Employee
        Employee[] employees = {
            new Employee(101, "Alice"),
            new Employee(102, "Bob")
        };

        Employee[] employeesCopy = Arrays.copyOf(employees, employees.length);

        System.out.println("\nMảng gốc: " + Arrays.toString(employees));
        System.out.println("Mảng copy: " + Arrays.toString(employeesCopy));

        // Thay đổi tên của phần tử đầu tiên trong mảng gốc
        employees[0].empName = "Anna";

        System.out.println("\nSau khi thay đổi mảng gốc:");
        System.out.println("Mảng gốc: " + Arrays.toString(employees));
        System.out.println("Mảng copy: " + Arrays.toString(employeesCopy));

        /*
         * ✅ Kết quả: Cả mảng gốc và mảng copy đều bị thay đổi
         * → Arrays.copyOf() khi áp dụng cho mảng object tạo **shallow copy**
         * (copy tham chiếu, không tạo object mới).
         */
    }
}

